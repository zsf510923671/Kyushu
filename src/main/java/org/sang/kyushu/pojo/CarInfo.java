package org.sang.kyushu.pojo;

/*
* 车型信息表
* */
public class CarInfo {

  private long id;              //编号
  private String brand;         //汽车品牌
  private String series;        //车系
  private String carModel;      //车型
  private String color;         //车辆颜色


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
