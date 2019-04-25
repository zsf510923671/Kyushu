package org.sang.kyushu.pojo;
/*
*客户车辆信息表
* */
public class Automobile_information {
    private int id;             //客户车辆信息id
    private String brand;       //汽车品牌
    private String series;      //车系
    private String license;     //牌照
    private String carModel;    //汽车型号
    private int cid;            //客户id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
