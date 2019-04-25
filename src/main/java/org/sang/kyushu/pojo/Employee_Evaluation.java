package org.sang.kyushu.pojo;

import java.util.Date;

/*
*员工评价表
* */
public class Employee_Evaluation {

  private long id;                 //编号
  private long eid;                //员工id
  private long cid;                //客户id
  private String content;          //内容
  private Date date; //日期


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
