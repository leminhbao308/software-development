package org.group06.model.manager;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.QuanAo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

public class Manager_QuanAo implements Manager_Interface<QuanAo> {

    private HashMap<String, String> dsLoaiQuanAo;
    private ArrayList<QuanAo> dsQuanAo;

    public Manager_QuanAo() {
        DAO_QuanAo dao_QuanAo = new DAO_QuanAo(DatabaseConstant.getConnection());
        dsQuanAo = new ArrayList<>();
        dsLoaiQuanAo = dao_QuanAo.getAllLoaiQuanAo();
    }

    public Manager_QuanAo(Connection connection) {
        DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);
        dsQuanAo = dao_QuanAo.getAll();
        dsLoaiQuanAo = dao_QuanAo.getAllLoaiQuanAo();
    }

    /**
     * Lấy tất cả các đối tượng trong danh sách
     *
     * @return danh sách đối tượng
     */
    @Override
    public ArrayList<QuanAo> getAll() {
        return dsQuanAo;
    }

    @Override
    public boolean add(QuanAo quanAo) {
        return dsQuanAo.add(quanAo);
    }

    @Override
    public boolean update(QuanAo quanAo) {
        for (QuanAo qa : dsQuanAo) {
            if (qa.getMaQA().equals(quanAo.getMaQA())) {
                qa.setTenQA(quanAo.getTenQA());
                qa.setLoaiQuanAo(quanAo.getLoaiQuanAo());
                qa.setKichThuoc(quanAo.getKichThuoc());
                qa.setSoLuong(quanAo.getSoLuong());
                qa.setThuongHieu(quanAo.getThuongHieu());
                qa.setNhaCungCap(quanAo.getNhaCungCap());
                qa.setGiaNhap(quanAo.getGiaNhap());
                qa.setLoiNhuan(quanAo.getLoiNhuan());
                qa.setTrangThai(quanAo.isTrangThai());
                qa.setHinhAnh(quanAo.getHinhAnh());
                return true;
            }
        }
        return false;
    }

    public boolean updateSoLuong(String maQA, int soLuong) {
        for (QuanAo qa : dsQuanAo) {
            if (qa.getMaQA().equals(maQA)) {
                qa.setSoLuong(soLuong);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(QuanAo quanAo) {
        return dsQuanAo.remove(quanAo);
    }

    @Override
    public QuanAo getByID(String id) {
        for (QuanAo qa : dsQuanAo) {
            if (qa.getMaQA().equals(id)) {
                return qa;
            }
        }
        return null;
    }

    public HashMap<String, String> getListLoaiQuanAo() {
        return dsLoaiQuanAo;
    }

    public String getTenLoaiQuanAo(String maLoaiQuanAo) {
        return dsLoaiQuanAo.get(maLoaiQuanAo);
    }

    public String getMaLoaiQuanAo(String tenLoaiQuanAo) {
        for (String maLoaiQuanAo : dsLoaiQuanAo.keySet()) {
            if (dsLoaiQuanAo.get(maLoaiQuanAo).equals(tenLoaiQuanAo)) {
                return maLoaiQuanAo;
            }
        }
        return null;
    }

    public void deleteAll() {
        dsQuanAo.clear();
    }
}
