/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSlide6;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class SV {
    String monhoc;
    String maSV;
    String hoTen;
    BigDecimal diem;

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public BigDecimal getDiem() {
        return diem;
    }

    public void setDiem(BigDecimal diem) {
        this.diem = diem;
    }

    public SV() {
    }
    
    public SV(String monhoc, String maSV, String hoTen, BigDecimal diem) {
        this.monhoc = monhoc;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
}
