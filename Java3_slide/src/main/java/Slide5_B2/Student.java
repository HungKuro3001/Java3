/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5_B2;

/**
 *
 * @author Administrator
 */
public class Student {
    private String maHS,tenHS,gioiTinh;
    private double diem;

    public Student() {
    }

    public Student(String maHS, String tenHS, String gioiTinh, double diem) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
