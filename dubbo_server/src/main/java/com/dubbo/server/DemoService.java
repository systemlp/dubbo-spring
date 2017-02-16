package com.dubbo.server;

import java.util.List;

public interface DemoService {

    String sayHello(String name);

    List<Object> getObjList();
}
