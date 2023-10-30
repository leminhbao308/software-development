package org.group06.model.manager;

import org.group06.db.dao.DAO_NhaCungCap;
import org.group06.model.entity.NhaCungCap;

import java.sql.Connection;
import java.util.ArrayList;

public class Manager_NhaCungCap implements Manager_Interface<NhaCungCap> {

    private ArrayList<NhaCungCap> dsNhaCungCap;

    public Manager_NhaCungCap(Connection connection) {
        dsNhaCungCap = new DAO_NhaCungCap(connection).getAll();
    }

    /**
     * Lấy tất cả các đối tượng trong danh sách
     *
     * @return danh sách đối tượng
     */
    @Override
    public ArrayList<NhaCungCap> getAll() {
        return dsNhaCungCap;
    }

    /**
     * Thêm đối tượng vào danh sách
     *
     * @param nhaCungCap đối tượng cần thêm
     * @return true nếu thêm thành công, false nếu thêm thất bại
     */
    @Override
    public boolean add(NhaCungCap nhaCungCap) {
        return dsNhaCungCap.add(nhaCungCap);
    }

    /**
     * Cập nhật đối tượng trong danh sách
     *
     * @param nhaCungCap đối tượng cần cập nhật
     * @return true nếu cập nhật thành công, false nếu cập nhật thất bại
     */
    @Override
    public boolean update(NhaCungCap nhaCungCap) {
        for (NhaCungCap ncc : dsNhaCungCap) {
            if (ncc.getMaNCC().equals(nhaCungCap.getMaNCC())) {
                ncc = nhaCungCap;
                return true;
            }
        }
        return false;
    }

    /**
     * Xóa đối tượng trong danh sách
     *
     * @param nhaCungCap đối tượng cần xóa
     * @return true nếu xóa thành công, false nếu xóa thất bại
     */
    @Override
    public boolean delete(NhaCungCap nhaCungCap) {
        return dsNhaCungCap.remove(nhaCungCap);
    }

    /**
     * Lấy đối tượng theo ID (Mã, SĐT,...)
     *
     * @param id ID của đối tượng cần lấy
     * @return đối tượng cần lấy, null nếu không tìm thấy
     */
    @Override
    public NhaCungCap getByID(String id) {
        for (NhaCungCap ncc : dsNhaCungCap) {
            if (ncc.getMaNCC().equals(id)) {
                return ncc;
            }
        }
        return null;
    }
}
