package cn.letcode.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
  
@Controller  
public class TestController   {  
      

//  @Reference(version="1.0.0")
//  private TestDubbo testDubbo;
      
      
    @RequestMapping("/test")  
    @ResponseBody   //标注为返回java对象  
    public String testDo(HttpServletRequest hsrq){  
        StringBuffer str = new StringBuffer();  
        str.append("test:");  
  
        return str.toString();
    }  
      
}  