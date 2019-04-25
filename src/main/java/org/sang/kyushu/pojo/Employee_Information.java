package org.sang.kyushu.pojo;

/*
*员工登录信息表
* */
public class Employee_Information {

  private long id;            //编号
  private String username;    //登录名
  private String name;        //员工名字
  private String sex;         //性别
  private String phone;       //联系电话
  private String address;     //地址
  private String password;    //密码
  private String idcard;      //身份证
  private String email;       //邮箱
  private String photo;       //照片
  private long epid;          //员工职位


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public long getEpid() {
    return epid;
  }

  public void setEpid(long epid) {
    this.epid = epid;
  }

}
