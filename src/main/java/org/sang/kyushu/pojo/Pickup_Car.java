package org.sang.kyushu.pojo;

import java.util.Date;

/**
 * 服务接待开单表
 */
public class Pickup_Car {

  private long id;          //编号
  private String number;    //接车单号
  private long eid;         //接待员工id
  private String cname;     //维修客户名称
  private long phone;       //联系电话
  private String license;   //汽车牌照
  private String frameNumber;//车架号
  private long mileage;     //里程数
  private Date enterTime;   //进厂时间
  private long rtid;        //服务类型


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }


  public long getPhone() {
    return phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }


  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }


  public String getFrameNumber() {
    return frameNumber;
  }

  public void setFrameNumber(String frameNumber) {
    this.frameNumber = frameNumber;
  }


  public long getMileage() {
    return mileage;
  }

  public void setMileage(long mileage) {
    this.mileage = mileage;
  }


  public Date getEnterTime() {
    return enterTime;
  }

  public void setEnterTime(Date enterTime) {
    this.enterTime = enterTime;
  }

  public long getRtid() {
    return rtid;
  }

  public void setRtid(long rtid) {
    this.rtid = rtid;
  }

}
