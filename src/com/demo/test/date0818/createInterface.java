package com.demo.test.date0818;

import java.util.Map;

public class createInterface {

    public createInterface(){}

    public void create(String filePath, Map<String,String> map){
        StringBuffer buffer =new StringBuffer();
        String aggVo=map.get("aggVo");
        // 设置文件包名
        buffer.append("package nccloud.itf.hrp.hrp;");
        buffer.append("\n");
        // 设置引用包名
        buffer.append("import nc.ui.querytemplate.querytree.IQueryScheme;");
        buffer.append("\n");
        buffer.append("import nc.vo.pub.BusinessException;");
        buffer.append("\n");

    }
}
