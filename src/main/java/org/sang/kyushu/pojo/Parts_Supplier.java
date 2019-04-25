package org.sang.kyushu.pojo;


/**
 * 配件供应商表
 */
public class Parts_Supplier {

  private long id;            //编号
  private String sName;       //供应商名称
  private String quality;     //品质
  private String contacts;    //联系人
  private String phone;       //联系电话
  private String email;       //邮箱
  private String mainCategory;//主营范畴
  private String account;     //汇款账户


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }


  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getMainCategory() {
    return mainCategory;
  }

  public void setMainCategory(String mainCategory) {
    this.mainCategory = mainCategory;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

}
