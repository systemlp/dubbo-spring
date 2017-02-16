package com.dubbo.server.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.dubbo.server.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        if (StringUtils.isNotEmpty(name))
            return "Hello " + name;
        return null;
    }

    public List<Object> getObjList() {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("二");
        list.add(3.0);
        return list;
    }

}
