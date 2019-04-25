package org.sang.kyushu.pojo;


/**
 *角色_菜单资源表
 */
public class Menu_Role {

  private long id;      //编号
  private long mid;     //菜单id
  private long rid;     //角色id


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }

}
