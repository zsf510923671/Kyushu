package org.sang.kyushu.pojo;


import java.util.Date;

/**
 * 服务预约表
 */
public class Subscribe {

  private long id;            //编号
  private String name;        //客户姓名
  private String phone;       //联系电话
  private Date arrivaltime;   //预约到店时间
  private long shop;          //是否到店 0已到 1未到


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Date getArrivaltime() {
    return arrivaltime;
  }

  public void setArrivaltime(Date arrivaltime) {
    this.arrivaltime = arrivaltime;
  }

  public long getShop() {
    return shop;
  }

  public void setShop(long shop) {
    this.shop = shop;
  }

}
