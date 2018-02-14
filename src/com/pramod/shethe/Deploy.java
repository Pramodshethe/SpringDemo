package com.pramod.shethe;

//import javax.annotation.Resource;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource; 


public class Deploy {
	public static void main(String args[]){
		
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) con.getBean("e");
		employee.show();
		
		/*Resource r = (Resource) new ClassPathResource("spring.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e");  
        s.show();*/
	}

}
