package org.group06.model.entity;

public class ChiTietPhieuDat {
    private PhieuDat phieuDat;
    private QuanAo quanAo;
    private int soLuong;
    private double giaBan;
    private double loiNhuan;

    public ChiTietPhieuDat() {
        this.phieuDat = new PhieuDat();
        this.quanAo = new QuanAo();
        this.soLuong = 0;
        this.giaBan = 0;
        this.loiNhuan = 0;
    }

//    public ChiTietPhieuDat(PhieuDat phieuDat, QuanAo quanAo, int soLuong, double giaBan) {
//        this.setPhieuDat(phieuDat);
//        this.setQuanAo(quanAo);
//        this.setSoLuong(soLuong);
//        this.setGiaBan(giaBan);
//    }

    public ChiTietPhieuDat(PhieuDat phieuDat, QuanAo quanAo, int soLuong, double giaBan, double loiNhuan) {
        this.setPhieuDat(phieuDat);
        this.setQuanAo(quanAo);
        this.setSoLuong(soLuong);
        this.setGiaBan(giaBan);
        this.setLoiNhuan(loiNhuan);
    }

    public PhieuDat getPhieuDat() {
        return phieuDat;
    }

    public void setPhieuDat(PhieuDat phieuDat) {
        this.phieuDat = phieuDat;
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

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuDat{" +
                "phieuDat=" + phieuDat +
                ", quanAo=" + quanAo +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", loiNhuan=" + loiNhuan +
                '}';
    }
}
