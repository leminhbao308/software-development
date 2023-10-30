package org.group06.model.entity;

import java.sql.Date;

public class HoaDon {
    private String maHoaDon;
    private Date ngayTao;
    private KhachHang khachHang;
    private NhanVien nhanVien;  
    private KhuyenMai khuyenMai;

    public HoaDon() {
        this.maHoaDon = "";
        this.ngayTao = new Date(System.currentTimeMillis());
        this.khachHang = new KhachHang();
        this.nhanVien = new NhanVien();
        this.khuyenMai = new KhuyenMai();
    }

    public HoaDon(String maHoaDon, Date ngayTao, KhachHang khachHang, NhanVien nhanVien, KhuyenMai khuyenMai) {
        this.setMaHoaDon(maHoaDon);
        this.setNgayTao(ngayTao);
        this.setKhachHang(khachHang);
        this.setNhanVien(nhanVien);
        this.setKhuyenMai(khuyenMai);
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
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
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayTao=" + ngayTao +
                ", khachHang=" + khachHang +
                ", nhanVien=" + nhanVien +
                ", khuyenMai=" + khuyenMai +
                '}';
    }
}
