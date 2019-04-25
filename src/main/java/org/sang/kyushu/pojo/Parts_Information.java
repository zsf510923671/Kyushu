package org.sang.kyushu.pojo;


/**
 * 配件信息总表
 */
public class Parts_Information {

  private long id;        //编号
  private String pname;   //配件名称
  private long parentId;  //父级目录id
  private long type;      //1 2级分类


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
