package org.sang.kyushu.pojo;


import java.util.Date;

/**
 * 活动通知表
 */
public class Notice {

  private long id;                  //编号
  private String content;           //内容
  private Date stime; //开始时间
  private Date etime; //结束时间


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Date getStime() {
    return stime;
  }

  public void setStime(Date stime) {
    this.stime = stime;
  }

  public Date getEtime() {
    return etime;
  }

  public void setEtime(Date etime) {
    this.etime = etime;
  }
}
