package com.mcsf19a029.loanedmoneytracker.model;

import android.graphics.Bitmap;

import java.math.BigDecimal;

public class Record {
    private int id;
    private int accID;
    private String description;
    private Double Currency;
    private String ImgName;
    private Bitmap Img;

    public Record(int accID, String description, Double currency, String imgName, Bitmap img) {
        this.accID = accID;
        this.description = description;
        Currency = currency;
        ImgName = imgName;
        Img = img;
    }

    public Record(int accID, String description, Double currency) {
        this.accID = accID;
        this.description = description;
        Currency = currency;
    }

    public String getImgName() {
        return ImgName;
    }

    public void setImgName(String imgName) {
        ImgName = imgName;
    }

    public Bitmap getImg() {
        return Img;
    }

    public void setImg(Bitmap img) {
        Img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCurrency() {
        return Currency;
    }

    public void setCurrency(Double currency) {
        Currency = currency;
    }
}
