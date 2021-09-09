package com.demo.test.date0818;

public class DemoTest01 {
    public void reflectTest(DemoTestVo demoTestVo){
        System.out.println(demoTestVo.getName()+demoTestVo.getSex()+demoTestVo.getAge());
    }

    public void anyType(DemoT t){
        System.out.println(t.getName());
    }
}
