package org.sang.kyushu.pojo;


/**
 * 菜单资源表
 */
public class Menu {

  private long id;        //编号
  private String url;     //路径


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
