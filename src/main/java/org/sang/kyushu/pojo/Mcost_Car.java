package org.sang.kyushu.pojo;


import java.util.Date;

/**
 * 维修开单表
 */
public class Mcost_Car {

  private long id;        //编号
  private long pcid;      //维修单号
  private long eid;       //维修员工id
  private long picid;     //配件是否充
  private Date statrTime; //开工时间
  private Date yjendTime; //预计完工时间
  private long rsid;      //维修状态
  private String remarks; //备注


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getPcid() {
    return pcid;
  }

  public void setPcid(long pcid) {
    this.pcid = pcid;
  }


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public long getPicid() {
    return picid;
  }

  public void setPicid(long picid) {
    this.picid = picid;
  }


  public Date getStatrTime() {
    return statrTime;
  }

  public void setStatrTime(Date statrTime) {
    this.statrTime = statrTime;
  }

  public Date getYjendTime() {
    return yjendTime;
  }

  public void setYjendTime(Date yjendTime) {
    this.yjendTime = yjendTime;
  }

  public long getRsid() {
    return rsid;
  }

  public void setRsid(long rsid) {
    this.rsid = rsid;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
