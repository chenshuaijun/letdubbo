package cn.letcode.service.demo;

import cn.letcode.api.DemoService;
import org.springframework.beans.factory.annotation.Value;


public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.service.version}")
    private String version;

    public String sayHello(String name) {
        return "Hello " + name;
    }


    public String getUserName() {
        return "demoService version -" + version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}