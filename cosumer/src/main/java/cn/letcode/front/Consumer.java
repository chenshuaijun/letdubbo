//package cn.letcode.front;
//
//import cn.letcode.api.DemoService;
//import com.alibaba.dubbo.config.annotation.Reference;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Consumer {
//
//    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});
//
////        @Reference(version = "1.0")
//        private DemoService demoServiceV1_0;// = (DemoService) context.getBean("demoServiceV1_0");
//        DemoService demoServiceV1_2 = (DemoService) context.getBean("demoServiceV1_2");
//        DemoService demoService = (DemoService) context.getBean("demoService");
//        if (demoServiceV1_0 != null) {
//            System.out.println("demoServiceV1_0" + demoServiceV1_0.getUserName());
//        }
//        if (demoServiceV1_2 != null) {
//            System.out.println("demoServiceV1_2" + demoServiceV1_2.getUserName());
//        }
//        if (demoService!=null) {
//            System.out.println("demoService" + demoService.getUserName());
//        }
//    }
//
//}