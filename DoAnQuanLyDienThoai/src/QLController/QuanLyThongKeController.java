/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import BUS.BUS_ThongKe;
import DTO.DTO_CTHD;
import DTO.DTO_HoaDon;
import DTO.DTO_NVTK;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Month;


//import java.awt.CardLayout;
//import java.awt.Dimension;
//import java.util.List;
//import javax.swing.JPanel;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Administrator
 */
public class QuanLyThongKeController {
    private BUS_ThongKe tkBus = null;

    public QuanLyThongKeController() {
        this.tkBus = new BUS_ThongKe();
    }

    public void setDataToChart1(JPanel jpnItem) {
        List<DTO_CTHD> listItem = tkBus.getListTopSanPham();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (DTO_CTHD item : listItem) {
                //Month Thang =  new Month(item.getNgaylap());
                dataset.addValue(item.getSoLuong(), "Số Lượng".toUpperCase(),item.getMaSp());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ sản phẩm bán chạy".toUpperCase(),
                "Sản Phẩm".toUpperCase(), "Số Lượng".toUpperCase(),
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(408, 305));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDataToChart2(JPanel jpnItem) {
        List<DTO_HoaDon> listItem = tkBus.getListDoanhThuTheoNgay();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (DTO_HoaDon item : listItem) {
                //Month Thang =  new Month(item.getNgaylap());
                dataset.addValue(item.getTienThanhToan(), "Doanh thu".toUpperCase(), item.getNgayLap());
            }
        }

        JFreeChart lineChart = ChartFactory.createLineChart("Biểu đồ thống kê doanh thu".toUpperCase(),"Thời gian".toUpperCase(),"Doanh thu".toUpperCase() , dataset, PlotOrientation.VERTICAL, false, true, false);                                

        ChartPanel chartPanel = new ChartPanel(lineChart);
        //chartPanel.setPreferredSize(new Dimension(858, 327));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDataToChart3(JPanel jpnItem) {
        List<DTO_NVTK> listItem = tkBus.getListTopNhanVien();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (DTO_NVTK item : listItem) {
                //Month Thang =  new Month(item.getNgaylap());
                dataset.addValue(item.getSL(), "Số Lượng".toUpperCase(),item.getTENNV());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ nhân viên bán tốt".toUpperCase(),
                "Tên nhân viên".toUpperCase(), "Số Lượng".toUpperCase(),
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(408, 305));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    
    public void setDataToChartNv(JPanel jpnItem, String maNv){
        DTO_NVTK nv = tkBus.getNhanVien(maNv);
        if(nv!=null){
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      
        dataset.addValue(nv.getSL(), "Số Lượng".toUpperCase(),nv.getTENNV());
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ nhân viên có mã: " + maNv + " bán được: ".toUpperCase() + nv.getSL() +" Hóa đơn",
                "Tên nhân viên".toUpperCase(), "Số Lượng hóa đơn".toUpperCase(),
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(408, 305));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
        }
        
    }
    
    
}