package org.group06.model.entity;

import java.sql.Date;

public class PhieuDat {
    private String maPhieuDat;
    private Date ngayTao;
    private Date ngayNhan;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private KhuyenMai khuyenMai;

    public PhieuDat() {
        this.maPhieuDat = "";
        this.ngayTao = new Date(System.currentTimeMillis());
        this.ngayNhan = ngayTao;
        this.khachHang = new KhachHang();
        this.nhanVien = new NhanVien();
        this.khuyenMai = new KhuyenMai();
    }

    public PhieuDat(String maPhieuDat, Date ngayTao, Date ngayNhan, KhachHang khachHang, NhanVien nhanVien, KhuyenMai khuyenMai) {
        this.setMaPhieuDat(maPhieuDat);
        this.setNgayTao(ngayTao);
        this.setNgayNhan(ngayNhan);
        this.setKhachHang(khachHang);
        this.setNhanVien(nhanVien);
        this.setKhuyenMai(khuyenMai);
    }

    public String getMaPhieuDat() {
        return maPhieuDat;
    }

    public void setMaPhieuDat(String maPhieuDat) {
        this.maPhieuDat = maPhieuDat;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "PhieuDat{" +
                "maPhieuDat='" + maPhieuDat + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngayNhan=" + ngayNhan +
                ", khachHang=" + khachHang +
                ", nhanVien=" + nhanVien +
                ", khuyenMai=" + khuyenMai +
                '}';
    }
}
