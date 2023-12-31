CREATE DATABASE QLDT
GO
USE [QLDT]
GO
/****** Object:  Table [dbo].[BaoHanh]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BaoHanh](
	[MABH] [nvarchar](20) NOT NULL,
	[MAKH] [nvarchar](20) NOT NULL,
	[MAHD] [nvarchar](20) NOT NULL,
	[MASP] [nvarchar](20) NOT NULL,
	[LYDO] [nvarchar](100) NOT NULL,
	[NGAYLAP] [date] NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_BaoHanh] PRIMARY KEY CLUSTERED 
(
	[MABH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTBH]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*****
CREATE TABLE [dbo].[CTBH](
	[SOTHUTU] [int] NOT NULL,
	[MABH] [nvarchar](20) NOT NULL,
	[LYDO] [nvarchar](100) NULL,
 CONSTRAINT [PK_CTBH] PRIMARY KEY CLUSTERED 
(
	[SOTHUTU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO *****/
/****** Object:  Table [dbo].[CTHD]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[MAHD] [nvarchar](20) NOT NULL,
	[MASP] [nvarchar](20) NOT NULL,
	[TENSP] [nvarchar](40) NOT NULL,
	[SL] [int] NOT NULL,
	[DONGIA] [money] NOT NULL,
	[THANHTIEN] [money] NOT NULL,
 CONSTRAINT [PK_CTHD_HoaDon_SanPham] PRIMARY KEY CLUSTERED 
(
	[MAHD] ASC,
	[MASP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTHDNH]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHDNH](
	[MAHDNH] [nvarchar](20) NOT NULL,
	[MASP] [nvarchar](20) NOT NULL,
	[TENSP] [nvarchar](40) NOT NULL,
	[SL] [int] NOT NULL,
	[DONGIA] [money] NOT NULL,
	[THANHTIEN] [money] NOT NULL,
 CONSTRAINT [PK_CTHDNH_HDNhapHang_SanPham] PRIMARY KEY CLUSTERED 
(
	[MAHDNH] ASC,
	[MASP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HDNhapHang]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HDNhapHang](
	[MAHDNH] [nvarchar](20) NOT NULL,
	[MANCC] [nvarchar](20) NOT NULL,
	[TENNCC] [nvarchar](40) NOT NULL,
	[NGAYGIAO] [date] NOT NULL,
	[TONGTIEN] [money] NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_HDNhapHang] PRIMARY KEY CLUSTERED 
(
	[MAHDNH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MAHD] [nvarchar](20) NOT NULL,
	[MANV] [nvarchar](20) NOT NULL,
	[MAKH] [nvarchar](20) NOT NULL,
	[NGAYLAP] [date] NOT NULL,
	[TONGTIEN] [money] NOT NULL,
	[GIAMGIA] [money] NOT NULL,
	[TIENTHANHTOAN] [money] NOT NULL,
	[TIENKHACH] [money] NOT NULL,
	[TIENTHOI] [money] NOT NULL,
	[NGAYKTBH] [date] NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MAHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MAKH] [nvarchar](20) NOT NULL,
	[TENKH] [nvarchar](50) NOT NULL,
	[SDTKH] [nvarchar](12) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MAKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[MAKM] [nvarchar](20) NOT NULL,
	[MASP] [nvarchar](20) NOT NULL,
	[TENSP] [nvarchar](40) NOT NULL,
	[TENKM] [nvarchar](40) NOT NULL,
	[PHANTRAMKM] [int] NOT NULL,
	[NGAYBD] [Date] NOT NULL,
	[NGAYKT] [Date] NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_KhuyenMai] PRIMARY KEY CLUSTERED 
(
	[MAKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHACC]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHACC](
	[MANCC] [nvarchar](20) NOT NULL,
	[TENNCC] [nvarchar](40) NOT NULL,
	[SDTNCC] [nvarchar](12) NOT NULL,
	[DIACHI] [nvarchar](40) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_NHACC] PRIMARY KEY CLUSTERED 
(
	[MANCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MANV] [nvarchar](20) NOT NULL,
	[TENNV] [nvarchar](40) NOT NULL,
	[NGAYSINH] [date] NOT NULL,
	[SDT] [nvarchar](12) NOT NULL,
	[DIACHI] [nvarchar](100) NOT NULL,
	[GIOITINH] [nvarchar](10) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MANV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MASP] [nvarchar](20) NOT NULL,
	[TENSP] [nvarchar](40) NOT NULL,
	[MATH] [nvarchar](20) NOT NULL,
	[MAUSAC] [nvarchar](20) NOT NULL,
	[DUNGLUONG] [nvarchar](20) NOT NULL,
	[DONGIA] [money] NOT NULL,
--	[KHUYENMAI] [money] NOT NULL,
	[SLTON] [int] NOT NULL,
	[IMG] [nvarchar](150) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MASP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TENDN] [nvarchar](20) NOT NULL,
	[MANV] [nvarchar](20) NOT NULL,
	[MK] [nvarchar](40) NOT NULL,
	[PQ] [nvarchar](20) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[TENDN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuongHieu]    Script Date: 10/18/2023 7:08:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuongHieu](
	[MATH] [nvarchar](20) NOT NULL,
	[TENTH] [nvarchar](40) NOT NULL,
	[TRANGTHAI] [int] NOT NULL,
 CONSTRAINT [PK_ThuongHieu] PRIMARY KEY CLUSTERED 
(
	[MATH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH001', N'KH001', N'HD001', N'IP13W',N'hu mang hinh', CAST(N'2023-05-15' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH002', N'KH001', N'HD001', N'MIR12S',N'hu mang hinh', CAST(N'2023-05-15' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH003', N'KH002', N'HD002', N'NKG22BL',N'hu mang hinh', CAST(N'2023-06-02' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH004', N'KH002', N'HD002', N'SSA23BL',N'hu mang hinh', CAST(N'2023-06-02' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH005', N'KH003', N'HD003', N'REC55Y',N'hu mang hinh', CAST(N'2023-06-08' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH006', N'KH001', N'HD004', N'MIR12B',N'hu mang hinh', CAST(N'2023-06-15' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH007', N'KH001', N'HD004', N'SSA23OR',N'hu mang hinh', CAST(N'2023-06-19' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH008', N'KH004', N'HD005', N'OPR10BL',N'hu mang hinh', CAST(N'2023-06-19' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH009', N'KH005', N'HD006', N'RE11PPW',N'hu mang hinh', CAST(N'2023-06-26' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH010', N'KH004', N'HD007', N'SSGSUMO',N'hu mang hinh', CAST(N'2023-07-03' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH011', N'KH006', N'HD008', N'VVV25PBL',N'hu mang hinh', CAST(N'2023-07-07' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH012', N'KH007', N'HD009', N'IP14V',N'hu mang hinh', CAST(N'2023-07-10' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH013', N'KH008', N'HD010', N'IP13P',N'hu mang hinh', CAST(N'2023-07-12' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH014', N'KH009', N'HD011', N'IP13B',N'hu mang hinh', CAST(N'2023-08-01' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH015', N'KH010', N'HD012', N'NKG22GR',N'hu mang hinh', CAST(N'2023-08-06' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH016', N'KH011', N'HD013', N'SSA23OR',N'hu mang hinh', CAST(N'2023-08-09' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH017', N'KH012', N'HD014', N'SSA23B',N'hu mang hinh', CAST(N'2023-08-13' AS Date), 1)
INSERT [dbo].[BaoHanh] ([MABH], [MAKH], [MAHD], [MASP],[LYDO], [NGAYLAP], [TRANGTHAI]) VALUES (N'BH018', N'KH013', N'HD015', N'OPR10BL',N'hu mang hinh', CAST(N'2023-08-17' AS Date), 1)
GO
/***
INSERT [dbo].[CTBH] ([SOTHUTU], [MABH], [LYDO]) VALUES (1, N'BH001', N'Mất nguồn')
INSERT [dbo].[CTBH] ([SOTHUTU], [MABH], [LYDO]) VALUES (2, N'BH006', N'Lỗi màn hình')
GO***/
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD001', N'IP13P', N'iPhone 13', 1, 20900000.0000, 20900000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD001', N'MIR12S', N'Xiaomi Redmi 12', 2, 4790000.0000, 9580000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD002', N'NKG22BL', N'Nokia G22', 1, 3990000.0000, 3990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD002', N'SSA23OR', N'Samsung Galaxy A23', 1, 5690000.0000, 5690000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD003', N'REC55Y', N'Realme C55', 2, 4990000.0000, 9980000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD004', N'MIR12B', N'Xiaomi Redmi 12', 1, 4790000.0000, 4790000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD004', N'SSA23B', N'Samsung Galaxy A23', 1, 5690000.0000, 5690000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD005', N'OPR10BL', N'Oppo Reno10 5G 128GB ', 1, 10990000.0000, 10990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD006', N'RE11PPW', N'Realme 11 Pro+ 5G ', 1, 14990000.0000, 14990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD007', N'SSGSUCR', N'Samsung Galaxy S23 Ultra 5G', 1, 31990000.0000, 31990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD008', N'VVV25PBL', N'Vivo V25 Pro 5G', 1, 13990000.0000, 13990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD009', N'IP14B', N'iPhone 14 Pro Max', 1, 29990000.0000, 29990000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD010', N'IP13W', N'iPhone 13', 1, 20900000.0000, 20900000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD011', N'IP13B', N'iPhone 13', 2, 20900000.0000, 41800000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD012', N'NKG22GR', N'Nokia G22', 3, 3990000.0000, 11970000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD013', N'SSA23OR', N'Samsung A23', 1, 5690000.0000, 5690000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD014', N'SSA23B', N'Samsung A23', 2, 5690000.0000, 11380000.0000)
INSERT [dbo].[CTHD] ([MAHD], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HD015', N'OPR10GR', N'Oppo Reno 10 5G 128GB', 1, 10990000.0000, 10990000.0000)
GO
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN001', N'IP13P', N'iPhone 13', 8, 18200000.0000, 145600000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN002', N'IP14V', N'iPhone 14 Pro Max', 5, 26500000.0000, 132500000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN003', N'NKG22BL', N'Nokia G22', 12, 3290000.0000, 39480000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN004', N'SSA23OR', N'Samsung A23', 12, 4320000.0000, 51840000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN005', N'SSGSUMO', N'Samsung Galaxy S23 Ultra 5G', 6, 30350000.0000, 182100000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN006', N'REC55Y', N'Realme C55', 10, 4160000.0000, 41600000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN007', N'VVV25PBL', N'Vivo V25 Pro 5G', 10, 12890000.0000, 128900000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN008', N'MIR12B', N'Xiaomi Redmi 12', 15, 3990000.0000, 59850000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN009', N'RE11PPW', N'Realme 11 Pro+ 5G', 8, 13540000.0000, 108320000.0000)
INSERT [dbo].[CTHDNH] ([MAHDNH], [MASP], [TENSP], [SL], [DONGIA], [THANHTIEN]) VALUES (N'HDN010', N'OPR10GR', N'Oppo Reno10 5G 128GB ', 10, 9820000.0000, 9820000.0000)
GO
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN001', N'NCC01', N'Digiworld', CAST(N'2023-01-05' AS Date), 145600000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN002', N'NCC01', N'Digiworld', CAST(N'2023-02-03' AS Date), 132500000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN003', N'NCC02', N'Synnex FPT', CAST(N'2023-03-01' AS Date), 39480000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN004', N'NCC01', N'Digiworld', CAST(N'2023-03-15' AS Date), 51840000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN005', N'NCC02', N'Synnex FPT', CAST(N'2023-04-10' AS Date), 182100000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN006', N'NCC02', N'Synnex FPT', CAST(N'2023-04-28' AS Date), 41600000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN007', N'NCC01', N'Digiworld', CAST(N'2023-05-15' AS Date), 128900000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN008', N'NCC02', N'Synnex FPT', CAST(N'2023-07-10' AS Date), 59850000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN009', N'NCC02', N'Synnex FPT', CAST(N'2023-08-03' AS Date), 108320000.0000, 1)
INSERT [dbo].[HDNhapHang] ([MAHDNH], [MANCC], [TENNCC], [NGAYGIAO], [TONGTIEN], [TRANGTHAI]) VALUES (N'HDN010', N'NCC01', N'Digiworld', CAST(N'2023-09-06' AS Date), 98200000.0000, 1)
GO
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD001', N'NV003', N'KH001', CAST(N'2023-05-15' AS Date), 30480000.0000, 1108700.0000, 29371300.0000, 29500000.0000, 130000.0000, CAST(N'2024-05-15' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD002', N'NV004', N'KH002', CAST(N'2023-06-02' AS Date), 9680000.0000, 968000.0000, 8712000.0000, 8750000.0000, 38000.0000, CAST(N'2024-06-02' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD003', N'NV004', N'KH003', CAST(N'2023-06-08' AS Date), 9980000.0000, 0.0000, 9980000.0000, 10000000.0000, 20000.0000, CAST(N'2024-06-08' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD004', N'NV005', N'KH001', CAST(N'2023-06-15' AS Date), 10480000.0000, 239500.0000, 10240500.0000, 10240000.0000, 0.0000, CAST(N'2024-06-15' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD005', N'NV003', N'KH004', CAST(N'2023-06-19' AS Date), 10990000.0000, 0.0000, 10990000.0000, 10100000.0000, 1000.0000, CAST(N'2024-06-19' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD006', N'NV003', N'KH005', CAST(N'2023-06-26' AS Date), 14990000.0000, 1049300.0000, 13940000.0000, 13500000.0000, 100000.0000, CAST(N'2024-06-26' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD007', N'NV005', N'KH004', CAST(N'2023-07-03' AS Date), 31990000.0000, 1599500.0000, 30390000.0000, 30390000.0000, 0.0000, CAST(N'2024-07-03' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD008', N'NV004', N'KH006', CAST(N'2023-07-07' AS Date), 13990000.0000, 699500.0000, 13290000.0000, 13300000.0000, 10000.0000, CAST(N'2024-07-07' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD009', N'NV005', N'KH007', CAST(N'2023-07-10' AS Date), 29990000.0000, 1499500.0000, 28490000.0000, 28500000.0000, 10000.0000, CAST(N'2024-07-10' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD010', N'NV005', N'KH008', CAST(N'2023-07-12' AS Date), 20900000.0000, 6297000.0000, 20270000.0000, 20500000.0000, 23000.0000, CAST(N'2024-07-12' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD011', N'NV004', N'KH009', CAST(N'2023-08-01' AS Date), 41800000.0000, 1260000.0000, 40540000.0000, 41000000.0000, 46000.0000, CAST(N'2024-08-01' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD012', N'NV003', N'KH010', CAST(N'2023-08-06' AS Date), 11970000.0000, 1197000.0000, 10773000.0000, 11000000.0000, 227000.0000, CAST(N'2024-08-06' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD013', N'NV003', N'KH011', CAST(N'2023-08-09' AS Date), 5690000.0000, 569000.0000, 5121000.0000, 5121000.0000, 0.0000, CAST(N'2023-08-09' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD014', N'NV003', N'KH012', CAST(N'2023-08-13' AS Date), 11380000.0000, 1138000.0000, 10242000.0000, 10250000.0000, 8000.0000, CAST(N'2023-08-13' AS Date), 1)
INSERT [dbo].[HoaDon] ([MAHD], [MANV], [MAKH], [NGAYLAP], [TONGTIEN], [GIAMGIA], [TIENTHANHTOAN], [TIENKHACH], [TIENTHOI], [NGAYKTBH], [TRANGTHAI]) VALUES (N'HD015', N'NV004', N'KH013', CAST(N'2023-08-17' AS Date), 10990000.0000, 0.0000, 10990000.0000, 10100000.0000, 1000.0000, CAST(N'2023-08-17' AS Date), 1)
GO
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH001', N'Đặng Minh Hiếu', N'0368283215', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH002', N'Lê Đỗ Ngọc Hân', N'0984231423', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH003', N'Nguyễn Văn Tiếng', N'0535221505', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH004', N'Nguyễn Trí Dũng', N'0382192989', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH005', N'Lê Thị Thanh Trúc', N'0868763386', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH006', N'Nguyễn Ngọc Diễm', N'0323654761', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH007', N'Trần Trí Dũng', N'0968065675', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH008', N'Nguyễn Nhật Kiên', N'0776652096', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH009', N'Nguyễn Thảo Trâm', N'0337334246', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH010', N'Vũ Vân Anh', N'0546721383', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH011', N'Phạm Nhật Nam', N'0385208694', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH012', N'Đặng Anh Huy', N'0873294652', 1)
INSERT [dbo].[KhachHang] ([MAKH], [TENKH], [SDTKH], [TRANGTHAI]) VALUES (N'KH013', N'Trần Thị Minh Thư', N'0967873359', 1)
GO
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM], [NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM001', N'IP13P', N'iPhone 13', N'Khuyen mai he', 3,CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date), 1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM],[NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM002', N'IP14V', N'iPhone 14', N'Xả kho giá sốc', 5, CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date),1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM],[NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM003', N'NKG22BL', N'Nokia G22', N'Xả kho giá sốc', 10,CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date), 1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM],[NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM004', N'SSGSUV', N'Samsung Galaxy S23 Ultra 5G', N'Tuần lễ vàng', 5,CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date), 1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM], [NGAYBD], [NGAYKT],[TRANGTHAI]) VALUES (N'KM005', N'VVV25PBL ', N'Vivo V25 Pro 5G', N'Tuần lễ vàng', 5, CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date),1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM],[NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM006', N'MIR12S', N'Xiaomi Redmi 12', N'Tuần lễ vàng', 5, CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date),1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM],[NGAYBD], [NGAYKT], [TRANGTHAI]) VALUES (N'KM007', N'RE11PPW', N'Realme 11 Pro+ 5G ', N'Xả kho giá sốc', 7, CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date),1)
INSERT [dbo].[KhuyenMai] ([MAKM], [MASP], [TENSP], [TENKM], [PHANTRAMKM], [NGAYBD], [NGAYKT],[TRANGTHAI]) VALUES (N'KM008', N'SSA23OR', N'Samsung A23', N'Xả kho giá sốc', 10, CAST(N'2023-05-15' AS Date), CAST(N'2023-08-13' AS Date),1)
GO
INSERT [dbo].[NHACC] ([MANCC], [TENNCC], [SDTNCC], [DIACHI], [TRANGTHAI]) VALUES (N'NCC01', N'Digiworld', N'02839290059', N'195-197 Nguyễn Thái Bình, Phường NTB, Q1', 1)
INSERT [dbo].[NHACC] ([MANCC], [TENNCC], [SDTNCC], [DIACHI], [TRANGTHAI]) VALUES (N'NCC02', N'Synnex FPT', N'02873006666', N'Toà nhà FPT, KCX Tân Thuận, Q7, TP HCM.', 1)
GO
INSERT [dbo].[NhanVien] ([MANV], [TENNV], [NGAYSINH], [SDT], [DIACHI], [GIOITINH], [TRANGTHAI]) VALUES (N'NV001', N'Nguyễn Hải An', CAST(N'1981-04-23' AS Date), N'0365124523', N'Tan Phu, HCM', N'Nam', 1)
INSERT [dbo].[NhanVien] ([MANV], [TENNV], [NGAYSINH], [SDT], [DIACHI], [GIOITINH], [TRANGTHAI]) VALUES (N'NV002', N'Trần Thị Bình Minh', CAST(N'1990-08-29' AS Date), N'0932109876', N'Tan Binh, HCM', N'Nam', 1)
INSERT [dbo].[NhanVien] ([MANV], [TENNV], [NGAYSINH], [SDT], [DIACHI], [GIOITINH], [TRANGTHAI]) VALUES (N'NV003', N'Phạm Thanh Hương', CAST(N'1996-01-12' AS Date), N'0363456789', N'Quan 5, HCM', N'Nữ', 1)
INSERT [dbo].[NhanVien] ([MANV], [TENNV], [NGAYSINH], [SDT], [DIACHI], [GIOITINH], [TRANGTHAI]) VALUES (N'NV004', N'Trần Duy Khang', CAST(N'1993-11-09' AS Date), N'0385208694', N'Go Vap, HCM', N'Nam', 1)
INSERT [dbo].[NhanVien] ([MANV], [TENNV], [NGAYSINH], [SDT], [DIACHI], [GIOITINH], [TRANGTHAI]) VALUES (N'NV005', N' Bùi Thị Lan Anh', CAST(N'1998-05-15' AS Date), N'0977437816', N'Quan 1, HCM', N'Nữ', 1)
GO
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP13P', N'iPhone 13', N'IP', N'Hồng', N'4GB-256GB', 20990000.0000, 5, N'/img/iphone-13-hong.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP13W', N'iPhone 13', N'IP', N'Trắng', N'4GB-256GB', 20990000.0000, 5, N'/img/iphone-13-trang.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP13B', N'iPhone 13', N'IP', N'Đen', N'4GB-256GB', 20990000.0000, 5, N'/img/iphone-13-den.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP14V', N'iPhone 14 Pro Max', N'IP', N'Tím', N'6GB-128GB', 29990000.0000, 2, N'/img/iphone-14-promax-tim.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP14B', N'iPhone 14 Pro Max', N'IP', N'Đen', N'6GB-128GB', 29990000.0000, 2, N'/img/iphone-14-promax-den.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'IP14Y', N'iPhone 14 Pro Max', N'IP', N'Vàng', N'6GB-128GB', 29990000.0000,2, N'/img/iphone-14-promax-vang.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'MIR12S', N'Xiaomi Redmi 12', N'MI', N'Bạc', N'8GB-128GB', 4790000.0000,10, N'/img/xiaomi-redmi12-bac.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'MIR12B', N'Xiaomi Redmi 12', N'MI', N'Đen', N'8GB-128GB', 4790000.0000,10, N'/img/xiaomi-redmi12-den.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'MIR12BL', N'Xiaomi Redmi 12', N'MI', N'Xanh dương', N'8GB-128GB', 4790000.0000,10, N'/img/xiaomi-redmi12-xanh.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'NKG22BL', N'Nokia G22', N'NK', N'Xanh dương', N'4GB-128GB', 3990000.0000,5, N'/img/nokia-g22-xanh.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'NKG22GR', N'Nokia G22', N'NK', N'xám', N'4GB-128GB', 3990000.0000, 5, N'/img/nokia-g22-xam.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'OPR10BL', N'Oppo Reno10 5G 128GB ', N'OP', N'Xanh dương', N'8GB-256GB', 10990000.0000, 6, N'/img/oppo-reno10-xanh.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'OPR10GR', N'Oppo Reno10 5G 128GB ', N'OP', N'xám', N'8GB-256GB', 10990000.0000, 6, N'/img/oppo-reno10-xam.jpeg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'RE11PPW', N'Realme 11 Pro+ 5G ', N'RE', N'Trắng', N'12GB-512GB', 14990000.0000, 5, N'/img/realme-11-pro-plus-trang.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'REC55Y', N'Realme C55', N'RE', N'Vàng', N'6GB-128GB', 4990000.0000, 7, N'/img/realme-c55-vang.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'REC55B', N'Realme C55', N'RE', N'Đen', N'6GB-128GB', 4990000.0000, 7, N'/img/realme-c55-den.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSA23BL', N'Samsung Galaxy A23', N'SS', N'Xanh dương', N'4GB-128GB', 5690000.0000,5, N'/img/samsung-galaxy-a23-xanh.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSA23OR', N'Samsung Galaxy A23', N'SS', N'cam', N'4GB-128GB', 5690000.0000,5, N'/img/samsung-galaxy-a23-cam.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSA23B', N'Samsung Galaxy A23', N'SS', N'đen', N'4GB-128GB', 5690000.0000,5, N'/img/samsung-galaxy-a23-den.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSGSUMO', N'Samsung Galaxy S23 Ultra 5G', N'SS', N'Rêu', N'8GB-256GB', 31990000.0000,3, N'/img/samsung-galaxy-s23-ultra-reu.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSGSUV', N'Samsung Galaxy S23 Ultra 5G', N'SS', N'tím', N'8GB-256GB', 31990000.0000,3, N'/img/samsung-galaxy-s23-ultra-tim.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSGSUCR', N'Samsung Galaxy S23 Ultra 5G', N'SS', N'kem', N'8GB-256GB', 31990000.0000,3, N'/img/samsung-galaxy-s23-ultra-kem.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'SSGSUB', N'Samsung Galaxy S23 Ultra 5G', N'SS', N'đen', N'8GB-256GB', 31990000.0000,3, N'/img/samsung-galaxy-s23-ultra-den.jpg', 1)

INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'VVV25PBL', N'Vivo V25 Pro 5G', N'VV', N'Xanh dương', N'8GB-128GB', 13990000.0000,7, N'/img/vivo-v25-pro-5g-xanh.jpg', 1)
INSERT [dbo].[SanPham] ([MASP], [TENSP], [MATH], [MAUSAC], [DUNGLUONG], [DONGIA], [SLTON], [IMG], [TRANGTHAI]) VALUES (N'VVV25PB', N'Vivo V25 Pro 5G', N'VV', N'Đen', N'8GB-128GB', 13990000.0000,7, N'/img/vivo-v25-pro-5g-den.jpg', 1)

GO
INSERT [dbo].[TaiKhoan] ([TENDN], [MANV], [MK], [PQ], [TRANGTHAI]) VALUES (N'admin', N'NV001', N'ad123456', N'ql', 1)
INSERT [dbo].[TaiKhoan] ([TENDN], [MANV], [MK], [PQ], [TRANGTHAI]) VALUES (N'manager', N'NV002', N'mn123456', N'nv', 1)
INSERT [dbo].[TaiKhoan] ([TENDN], [MANV], [MK], [PQ], [TRANGTHAI]) VALUES (N'nvbanhang1', N'NV003', N'nvbh11234', N'nv', 1)
INSERT [dbo].[TaiKhoan] ([TENDN], [MANV], [MK], [PQ], [TRANGTHAI]) VALUES (N'nvbanhang2', N'NV004', N'nvbh21234', N'nv', 1)
INSERT [dbo].[TaiKhoan] ([TENDN], [MANV], [MK], [PQ], [TRANGTHAI]) VALUES (N'nvbanhang3', N'NV005', N'nvbh33412', N'nv', 1)
GO
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'IP', N'IPhone', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'MI', N'Xiaomi', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'NK', N'Nokia', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'OP', N'Oppo', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'RE', N'Realme', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'SS', N'Samsung', 1)
INSERT [dbo].[ThuongHieu] ([MATH], [TENTH], [TRANGTHAI]) VALUES (N'VV', N'Vivo', 1)
GO
ALTER TABLE [dbo].[BaoHanh]  WITH CHECK ADD  CONSTRAINT [FK_BaoHanh_HoaDon] FOREIGN KEY([MAHD])
REFERENCES [dbo].[HoaDon] ([MAHD])
GO
ALTER TABLE [dbo].[BaoHanh] CHECK CONSTRAINT [FK_BaoHanh_HoaDon]
GO
ALTER TABLE [dbo].[BaoHanh]  WITH CHECK ADD  CONSTRAINT [FK_BaoHanh_KhachHang] FOREIGN KEY([MAKH])
REFERENCES [dbo].[KhachHang] ([MAKH])
GO
ALTER TABLE [dbo].[BaoHanh] CHECK CONSTRAINT [FK_BaoHanh_KhachHang]
GO
ALTER TABLE [dbo].[BaoHanh]  WITH CHECK ADD  CONSTRAINT [FK_BaoHanh_SanPham] FOREIGN KEY([MASP])
REFERENCES [dbo].[SanPham] ([MASP])
GO
ALTER TABLE [dbo].[BaoHanh] CHECK CONSTRAINT [FK_BaoHanh_SanPham]
GO
ALTER TABLE [dbo].[CTBH]  WITH CHECK ADD  CONSTRAINT [FK_CTBH_BaoHanh] FOREIGN KEY([MABH])
REFERENCES [dbo].[BaoHanh] ([MABH])
GO
ALTER TABLE [dbo].[CTBH] CHECK CONSTRAINT [FK_CTBH_BaoHanh]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HoaDon] FOREIGN KEY([MAHD])
REFERENCES [dbo].[HoaDon] ([MAHD])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_HoaDon]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_SanPham] FOREIGN KEY([MASP])
REFERENCES [dbo].[SanPham] ([MASP])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_SanPham]
GO
ALTER TABLE [dbo].[CTHDNH]  WITH CHECK ADD  CONSTRAINT [FK_CTHDNH_HDNhapHang] FOREIGN KEY([MAHDNH])
REFERENCES [dbo].[HDNhapHang] ([MAHDNH])
GO
ALTER TABLE [dbo].[CTHDNH] CHECK CONSTRAINT [FK_CTHDNH_HDNhapHang]
GO
ALTER TABLE [dbo].[CTHDNH]  WITH CHECK ADD  CONSTRAINT [FK_CTHDNH_SanPham] FOREIGN KEY([MASP])
REFERENCES [dbo].[SanPham] ([MASP])
GO
ALTER TABLE [dbo].[CTHDNH] CHECK CONSTRAINT [FK_CTHDNH_SanPham]
GO
ALTER TABLE [dbo].[HDNhapHang]  WITH CHECK ADD  CONSTRAINT [FK_HDNhapHang_NHACC] FOREIGN KEY([MANCC])
REFERENCES [dbo].[NHACC] ([MANCC])
GO
ALTER TABLE [dbo].[HDNhapHang] CHECK CONSTRAINT [FK_HDNhapHang_NHACC]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MAKH])
REFERENCES [dbo].[KhachHang] ([MAKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MANV])
REFERENCES [dbo].[NhanVien] ([MANV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[KhuyenMai]  WITH CHECK ADD  CONSTRAINT [FK_KhuyenMai_SanPham] FOREIGN KEY([MASP])
REFERENCES [dbo].[SanPham] ([MASP])
GO
ALTER TABLE [dbo].[KhuyenMai] CHECK CONSTRAINT [FK_KhuyenMai_SanPham]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_ThuongHieu] FOREIGN KEY([MATH])
REFERENCES [dbo].[ThuongHieu] ([MATH])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_ThuongHieu]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([MANV])
REFERENCES [dbo].[NhanVien] ([MANV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
