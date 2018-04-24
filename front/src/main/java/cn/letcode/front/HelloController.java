package cn.letcode.front;

import cn.letcode.api.DemoService;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {


//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});

//    @Reference(version = "1.0")
//    DemoService demoServiceV1_0;
//    DemoService demoServiceV1_0 = (DemoService) context.getBean("demoServiceV1_0");

    //    DemoService demoServiceV1_2 = (DemoService) context.getBean("demoServiceV1_2");
//    @Reference(version = "1.2")
//    DemoService demoServiceV1_2;
//
    //= (DemoService) context.getBean("demoService");

    @Resource
    WebApplicationContext webApplicationContext;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String printHello(HttpServletRequest request,
                      @RequestParam(value = "version") String version,
                      @RequestParam(value = "tranCode") String tranCode) {


        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();

        reference.setInterface("cn.letcode.api.DemoService");
        reference.setId(tranCode);
        reference.setVersion("1.2");
        reference.setGeneric(true);

        GenericService genericService = reference.get();

        Object result = genericService.$invoke("getUserName", null, null);


        System.out.println(result);
        return (String) result;
//        demoServiceV1_0 = (Demo Service) context.getBean("demoService" + version);
//        if (demoServiceV1_0 != null) {
//            System.out.println("demoServiceV1_0" + demoServiceV1_0.getUserName());
//        }
//
//        demoServiceV1_2 = (DemoService) context.getBean("demoService" + version);
//        if (demoServiceV1_2 != null) {
//            System.out.println("demoServiceV1_2" + demoServiceV1_2.getUserName());
//        }
//
//        if (demoService != null) {
//            System.out.println("demoService" + demoService.getUserName());
//        }

//= (WebApplicationContext) request.getSession().getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//        webApplicationContext.getBean(TimerBin.class);
//        webApplicationContext.getBean("timerBin");

//        DemoService demoService;
//
//        try {
//            demoService = (DemoService) webApplicationContext.getBean("demoService" + version);
//        } catch (Exception e) {
//            demoService = (DemoService) webApplicationContext.getBean("demoService");
//        }
//        return "hello version is " + version + "<br> demoService  " + version + " ::" + demoService.getUserName();
    }


    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }
}