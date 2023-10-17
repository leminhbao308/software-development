package org.group06.model.manager;

import org.group06.model.entity.KhachHang;

import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<KhachHang> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
    }

    public CustomerManager(ArrayList<KhachHang> customers) {
        this.customers = customers;
    }

    public static void main(String[] args) {
        ArrayList<KhachHang> c1 = new ArrayList<>();

        CustomerManager cm = new CustomerManager(c1);

        System.out.println("Danh sach cac khach hang");
        for (KhachHang c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien them mot khach hang");

        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (KhachHang c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien xoa mot khach hang");
        if (cm.removeCustomer("NV05")) {
            System.out.println("Xoa thanh cong!");
        }
        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (KhachHang c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien cap nhat ten mot khach hang");
        if (cm.updateCustomer("NV03", "Le Hoang Nam")) {
            System.out.println("Cap nhat thanh cong!");
        }
        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (KhachHang c : cm.getCustomers()) {
            System.out.println(c.toString());
        }
    }

    public ArrayList<KhachHang> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<KhachHang> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(KhachHang customer) {
        return customers.add(customer);
    }

    public boolean removeCustomer(String customerID) {
        for (KhachHang c : customers) {
            if (c.getMaKhachHang().equals(customerID)) {
                return customers.remove(c);
            }
        }
        return false;
    }

    public boolean updateCustomer(String customerID, String data) {
        for (KhachHang c : customers) {
            if (c.getMaKhachHang().equals(customerID)) {
                c.setTenKH(data);
                return true;
            }
        }
        return false;
    }
}

