package org.sang.kyushu.pojo;


import java.util.Date;

/**
 *订单结算单
 */
public class Opening_Order {

  private long id;            //编号
  private long uid;           //维修接车id
  private long mcost;         //维修费
  private String pname;       //配件名称
  private long pnamenum;      //用到的配件数量
  private long settlement;    //是否结算
  private Date factorytime;   //出厂时间


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getMcost() {
    return mcost;
  }

  public void setMcost(long mcost) {
    this.mcost = mcost;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public long getPnamenum() {
    return pnamenum;
  }

  public void setPnamenum(long pnamenum) {
    this.pnamenum = pnamenum;
  }


  public long getSettlement() {
    return settlement;
  }

  public void setSettlement(long settlement) {
    this.settlement = settlement;
  }


  public Date getFactorytime() {
    return factorytime;
  }

  public void setFactorytime(Date factorytime) {
    this.factorytime = factorytime;
  }
}
