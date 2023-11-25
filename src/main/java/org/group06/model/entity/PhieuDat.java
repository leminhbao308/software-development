package org.group06.model.entity;

import java.sql.Date;

public class PhieuDat {
    public static final int CHUA_DEN_HEN = 0;
    public static final int CHO_NHAN_HANG = 1;
    public static final int DA_QUA_HAN = -1;

    private String maPhieuDat;
    private Date ngayTao;
    private Date ngayNhan;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private KhuyenMai khuyenMai;
    private int trangThai;
    private boolean thanhToan;

    public PhieuDat() {
        this.maPhieuDat = "";
        this.ngayTao = new Date(System.currentTimeMillis());
        this.ngayNhan = ngayTao;
        this.khachHang = new KhachHang();
        this.nhanVien = new NhanVien();
        this.khuyenMai = new KhuyenMai();
        this.trangThai = CHUA_DEN_HEN;
    }

    public PhieuDat(String maPhieuDat, Date ngayTao, Date ngayNhan, KhachHang khachHang, NhanVien nhanVien, KhuyenMai khuyenMai, int trangThai, boolean thanhToan) {
        this.setMaPhieuDat(maPhieuDat);
        this.setNgayTao(ngayTao);
        this.setNgayNhan(ngayNhan);
        this.setKhachHang(khachHang);
        this.setNhanVien(nhanVien);
        this.setKhuyenMai(khuyenMai);
        this.setTrangThai(trangThai);
        this.setThanhToan(thanhToan);
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(boolean thanhToan) {
        this.thanhToan = thanhToan;
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
                ", trangThai=" + trangThai +
                '}';
    }
}
