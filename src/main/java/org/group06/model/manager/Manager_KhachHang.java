package org.group06.model.manager;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_KhachHang;
import org.group06.model.entity.KhachHang;

import java.sql.Connection;
import java.util.ArrayList;

public class Manager_KhachHang implements Manager_Interface<KhachHang> {
    private ArrayList<KhachHang> dsKhachHang;
    private DAO_KhachHang daoKhachHang;

    public Manager_KhachHang() {
        daoKhachHang = new DAO_KhachHang(DatabaseConnect.getConnection());
        dsKhachHang = daoKhachHang.getAll();
    }

    public Manager_KhachHang(Connection connection) {
        daoKhachHang = new DAO_KhachHang(connection);
        this.dsKhachHang = daoKhachHang.getAll();
    }

    @Override
    public ArrayList<KhachHang> getAll() {
        return dsKhachHang;
    }

    @Override
    public boolean add(KhachHang khachHang) {
        return dsKhachHang.add(khachHang);
    }

    @Override
    public boolean update(KhachHang khachHang) {
        for (KhachHang kh : dsKhachHang) {
            if (kh.getMaKhachHang().equals(khachHang.getMaKhachHang())) {
                kh = khachHang;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(KhachHang khachHang) {
        return dsKhachHang.remove(khachHang);
    }

    @Override
    public KhachHang getByID(String id) {
        for (KhachHang kh : dsKhachHang) {
            if (kh.getMaKhachHang().equals(id)) {
                return kh;
            }
        }
        return null;
    }

    @Override
    public boolean save() {
        // TODO: Save with thread to avoid overloading
//        for (KhachHang kh : dsKhachHang) {
//            Thread thread = new Thread(() -> {
//                if (kh.isNew()) {
//                    daoKhachHang.add(kh);
//                } else {
//                    daoKhachHang.update(kh);
//                }
//            });
//        }
        return true;
    }
}
