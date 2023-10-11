﻿CREATE DATABASE QLDT
GO
USE QLDT
GO
create table NhanVien(
MANV nvarchar(20) not null,
TENNV nvarchar(40) not null,
NGAYSINH DATE NOT NULL,
SDT NVARCHAR(12) NOT NULL,
DIACHI NVARCHAR(100) NOT NULL,
GIOITINH NVARCHAR(10) NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_NhanVien PRIMARY KEY(MANV)
)
GO
create table TaiKhoan(
TENDN nvarchar(20) not null,
MANV nvarchar(20) not null,
MK nvarchar(40) NOT NULL,
PQ nvarchar(20) NOT NULL,
TRANGTHAI integer NOT NULL,
constraint PK_TaiKhoan primary key(TENDN),
CONSTRAINT FK_TaiKhoan_NhanVien FOREIGN KEY(MANV) REFERENCES NhanVien(MANV)
)
GO
CREATE TABLE KhachHang(
MAKH NVARCHAR(20) NOT NULL,
SDTKH NVARCHAR(12) NOT NULL,
NGAYSINHKH DATE NOT NULL,
GOITINHKH NVARCHAR(10) NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_KhachHang PRIMARY KEY(MAKH)
)
GO
CREATE TABLE NHACC(
MANCC NVARCHAR(20) NOT NULL,
TENNCC NVARCHAR(40) NOT NULL,
SDTNCC NVARCHAR(12) NOT NULL,
DIACHI NVARCHAR(40) NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_NHACC PRIMARY KEY(MANCC)
)
GO
CREATE TABLE ThuongHieu(
MATH NVARCHAR(20) NOT NULL,
TENTH NVARCHAR(40) NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_ThuongHieu PRIMARY KEY(MATH)
)
GO
CREATE TABLE HoaDon(
MAHD NVARCHAR(20) NOT NULL,
MANV NVARCHAR(20) NOT NULL,
MAKH NVARCHAR(20) NOT NULL,
NGAYLAP DATE NOT NULL,
TONGTIEN MONEY NOT NULL,
GIAMGIA MONEY NOT NULL,
TIENTHANHTOAN MONEY NOT NULL,
TIENKHACH MONEY NOT NULL,
TIENTHOI MONEY NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_HoaDon PRIMARY KEY(MAHD),
CONSTRAINT FK_HoaDon_NhanVien FOREIGN KEY(MANV) REFERENCES NhanVien(MANV),
CONSTRAINT FK_HoaDon_KhachHang FOREIGN KEY(MAKH) REFERENCES KhachHang(MAKH)
)
GO
CREATE TABLE SanPham(
MASP NVARCHAR(20) NOT NULL,
TENSP NVARCHAR(40) NOT NULL,
MATH NVARCHAR(20) NOT NULL,
MAUSAC NVARCHAR(20) NOT NULL,
DUNGLUONG NVARCHAR(20) NOT NULL,
DONGIA MONEY NOT NULL,
KHUYENMAI MONEY NOT NULL,
SLTON INTEGER NOT NULL,
IMG NVARCHAR(50) NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_SanPham PRIMARY KEY(MASP),
CONSTRAINT FK_SanPham_ThuongHieu FOREIGN KEY(MATH) REFERENCES ThuongHieu(MATH)
)
GO
CREATE TABLE KhuyenMai(
MAKM NVARCHAR(20) not null,
MASP NVARCHAR(20) NOT NULL,
TENSP NVARCHAR(40) NOT NULL,
TENKM NVARCHAR(40) NOT NULL,
PHANTRAMKM INTEGER NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_KhuyenMai PRIMARY KEY(MAKM),
CONSTRAINT FK_KhuyenMai_SanPham FOREIGN KEY(MASP) REFERENCES SanPham(MASP)
)
GO
CREATE TABLE CTHD(
MAHD NVARCHAR(20) NOT NULL,
MASP NVARCHAR(20) NOT NULL,
TENSP NVARCHAR(40) NOT NULL,
SL INTEGER NOT NULL,
DONGIA MONEY NOT NULL,
THANHTIEN MONEY NOT NULL,
CONSTRAINT PK_CTHD_HoaDon_SanPham PRIMARY KEY(MAHD,MASP),

CONSTRAINT FK_CTHD_HoaDon FOREIGN KEY(MAHD) REFERENCES HoaDon(MAHD),
CONSTRAINT FK_CTHD_SanPham FOREIGN KEY(MASP) REFERENCES SanPham(MASP)
)
GO

CREATE TABLE CTBH(
SOTHUTU INT NOT NULL,
MABH NVARCHAR(20) NOT NULL,
LYDO NVARCHAR(100) ,
CONSTRAINT PK_CTBH PRIMARY KEY(SOTHUTU),
CONSTRAINT FK_CTBH_BaoHanh FOREIGN KEY(MABH) REFERENCES BaoHanh(MABH),
)


CREATE TABLE BaoHanh(
MABH NVARCHAR(20) NOT NULL,
MAKH NVARCHAR(20) NOT NULL, 
MAHD NVARCHAR(20) NOT NULL,
MASP NVARCHAR(20) NOT NULL,
--TENKH NVARCHAR(40) NOT NULL,
--TENSP NVARCHAR(40) NOT NULL,
NGAYBD DATE NOT NULL,
NGAYKT DATE NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_BaoHanh PRIMARY KEY(MABH),
CONSTRAINT FK_BaoHanh_KhachHang FOREIGN KEY(MAKH) REFERENCES KhachHang(MAKH),
CONSTRAINT FK_BaoHanh_HoaDon FOREIGN KEY(MAHD) REFERENCES HoaDon(MAHD),
CONSTRAINT FK_BaoHanh_SanPham FOREIGN KEY(MASP) REFERENCES SanPham(MASP)
)
GO
CREATE TABLE HDNhapHang(
MAHDNH NVARCHAR(20) NOT NULL,
MANCC NVARCHAR(20) NOT NULL,
TENNCC NVARCHAR(40) NOT NULL,
NGAYGIAO DATE NOT NULL,
TONGTIEN MONEY NOT NULL,
TRANGTHAI INTEGER NOT NULL,
CONSTRAINT PK_HDNhapHang PRIMARY KEY(MAHDNH),
CONSTRAINT FK_HDNhapHang_NHACC  FOREIGN KEY(MANCC) REFERENCES NHACC(MANCC)
)
GO
CREATE TABLE CTHDNH(
MAHDNH NVARCHAR(20) NOT NULL,
MASP NVARCHAR(20) NOT NULL,
TENSP NVARCHAR(40) NOT NULL,
SL INTEGER NOT NULL,
DONGIA MONEY NOT NULL,
THANHTIEN MONEY NOT NULL,
CONSTRAINT PK_CTHDNH_HDNhapHang_SanPham PRIMARY KEY(MAHDNH,MASP),
CONSTRAINT FK_CTHDNH_HDNhapHang  FOREIGN KEY(MAHDNH) REFERENCES HDNhapHang(MAHDNH),
CONSTRAINT FK_CTHDNH_SanPham  FOREIGN KEY(MASP) REFERENCES SanPham(MASP)
)





