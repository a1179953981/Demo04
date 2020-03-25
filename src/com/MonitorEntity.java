package com;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "Monitor", schema = "asset", catalog = "")
public class MonitorEntity {
    private int no;

    @Id
    @javax.persistence.Column(name = "No")
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private String brand;

    @Basic
    @javax.persistence.Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private Double size;

    @Basic
    @javax.persistence.Column(name = "Size")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String starus;

    @Basic
    @javax.persistence.Column(name = "Starus")
    public String getStarus() {
        return starus;
    }

    public void setStarus(String starus) {
        this.starus = starus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonitorEntity that = (MonitorEntity) o;
        return no == that.no &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(size, that.size) &&
                Objects.equals(note, that.note) &&
                Objects.equals(starus, that.starus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, brand, size, note, starus);
    }
}
