package com.demo.test.date0818;

public class DemoTestVo {
    private String name;
    private Integer age;
    private String School;
    private String sex;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public  DemoTestVo valueOf(String name,String sex,Integer age){
        DemoTestVo demo=new DemoTestVo();
        demo.age=age;
        demo.name=name;
        demo.sex=sex;
        return demo;
    }

}
