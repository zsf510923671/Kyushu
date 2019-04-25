package org.sang.kyushu.pojo;


/**
 * 配件信息从表
 */
public class Parts_Information_Category {

  private long id;              //编号
  private String pname;         //配件名称
  private long price;           //配件价格
  private long stock;           //配件库存
  private long categoryLevel1Id;//分类1
  private long categoryLevel2Id;//分类2
  private long categoryLevel3Id;//分类3


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


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getCategoryLevel1Id() {
    return categoryLevel1Id;
  }

  public void setCategoryLevel1Id(long categoryLevel1Id) {
    this.categoryLevel1Id = categoryLevel1Id;
  }


  public long getCategoryLevel2Id() {
    return categoryLevel2Id;
  }

  public void setCategoryLevel2Id(long categoryLevel2Id) {
    this.categoryLevel2Id = categoryLevel2Id;
  }


  public long getCategoryLevel3Id() {
    return categoryLevel3Id;
  }

  public void setCategoryLevel3Id(long categoryLevel3Id) {
    this.categoryLevel3Id = categoryLevel3Id;
  }

}
