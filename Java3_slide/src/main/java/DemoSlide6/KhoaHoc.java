/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSlide6;

/**
 *
 * @author Administrator
 */
public class KhoaHoc {
    private String maKH,tenKH;
    private float hocPhi;
    private int thoiLuong;

    public KhoaHoc() {
    }

    public KhoaHoc(String maKH, String tenKH, float hocPhi, int thoiLuong) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        return maKH;
    }
    
}
