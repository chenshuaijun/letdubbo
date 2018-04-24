//package cn.letcode.front;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//public class ApplicationContextUtil implements ApplicationContextAware {
//
//    @Resource
//    private static ApplicationContext context;
//
//    public void setApplicationContext(ApplicationContext context)
//            throws BeansException {
//        this.context = context;
//    }
//
//    public static ApplicationContext getApplicationContext() {
//        return context;
//    }
//
//    public Object getBean(String name) {
//        return context.getBean(name);
//    }
//
//    public <T> T getBean(Class<T> className) {
//        return context.getBean(className);
//    }
//}