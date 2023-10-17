package org.group06.model.entity;

public class ChiTietHoaDon {
    private HoaDon hoaDon;
    private QuanAo quanAo;
    private int soLuong;
    private double giaBan;

    public ChiTietHoaDon() {
        this.hoaDon = new HoaDon();
        this.quanAo = new QuanAo();
        this.soLuong = 0;
        this.giaBan = 0;
    }

    public ChiTietHoaDon(HoaDon hoaDon, QuanAo quanAo, int soLuong, double giaBan) {
        this.setHoaDon(hoaDon);
        this.setQuanAo(quanAo);
        this.setSoLuong(soLuong);
        this.setGiaBan(giaBan);
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public QuanAo getQuanAo() {
        return quanAo;
    }

    public void setQuanAo(QuanAo quanAo) {
        this.quanAo = quanAo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "hoaDon=" + hoaDon +
                ", quanAo=" + quanAo +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                '}';
    }
}
