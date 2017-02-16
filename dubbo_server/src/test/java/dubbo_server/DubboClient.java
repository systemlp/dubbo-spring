package dubbo_server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.server.DemoService;

public class DubboClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] { "dubbo_client.xml" });
        applicationContext.start();
        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
        System.out.println(demoService.sayHello("world"));
        System.out.println(demoService.getObjList());
    }
}
