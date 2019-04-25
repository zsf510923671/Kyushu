package org.sang.kyushu.pojo;

import java.util.Date;

/**
 *
 */
public class Supplier_Procurement {

  private long id;            //编号
  private long sid;           //供应商id
  private long eid;           //采购员id
  private long pid;           //配件id
  private long price;         //配件单价
  private long num;           //配件数量
  private long totalPeice;    //总价
  private Date buyTime;       //采购日期
  private String orderNo;     //订单编号
  private long orderStatus;   //订单状态


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public long getTotalPeice() {
    return totalPeice;
  }

  public void setTotalPeice(long totalPeice) {
    this.totalPeice = totalPeice;
  }


  public Date getBuyTime() {
    return buyTime;
  }

  public void setBuyTime(Date buyTime) {
    this.buyTime = buyTime;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }

}
