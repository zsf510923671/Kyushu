package org.sang.kyushu.pojo;


/**
 * 维修状态表
 */
public class Repair_State {

  private long id;          //编号
  private String state;     //维修状态


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
