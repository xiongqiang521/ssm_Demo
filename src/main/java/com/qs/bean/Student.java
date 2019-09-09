package com.qs.bean;


public class Student {

  private String id;
  private String name;
  private String sex;
  private Long age;
  private String group;

  @Override
  public String toString() {
    return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            ", group='" + group + '\'' +
            '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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


  public long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }


  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

}
