package org.sang.kyushu.pojo;

import java.util.Date;

/*
* 客户回访表
* */
public class Customer_Returnvisit {

  private long id;                   //编号
  private long eid;                  //员工id
  private long cid;                  //客户id
  private Date time;   //回访时间
  private String cFeedback;          //客户反馈

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

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getcFeedback() {
    return cFeedback;
  }

  public void setcFeedback(String cFeedback) {
    this.cFeedback = cFeedback;
  }
}
