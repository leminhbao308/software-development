package org.group06.model.entity;

/**
 * @author Le Hoang Nam
 */
public class NhaCungCap {
    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String soDienThoai;


    public NhaCungCap() {
        this.maNCC = "Chưa xác định";
        this.tenNCC = "Chưa xác định";
        this.diaChi = "Chưa xác định";
        this.soDienThoai = "0xxxxxxxxx";
    }

    /**
     * @param maNCC       mã nhà cung cấp được xử lý tự động phát sinh theo quy tắc đã quy định
     * @param tenNCC      tên nhà cung cấp được định dạng viết In Hoa chữ cái đầu
     * @param diaChi      địa chỉ của nhà cung cấp
     * @param soDienThoai số điện thoại liên lạc của nhà cung cấp
     */
    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String soDienThoai) {
        this.setMaNCC(maNCC);
        this.setTenNCC(tenNCC);
        this.setDiaChi(diaChi);
        this.setSoDienThoai(soDienThoai);
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "NhaCungCap{" +
                "maNCC='" + maNCC + '\'' +
                ", tenNCC='" + tenNCC + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}
