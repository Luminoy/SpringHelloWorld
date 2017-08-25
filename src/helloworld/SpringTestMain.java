package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestMain {
	public static void main(String[] args) {
		// 获取应用的上下文对象，可理解为“管家”
				ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
				// 通过上下文对象获取bean（反射机制）
				Person person = context.getBean("man", Person.class);
				// 执行获取对象的一些方法
				person.info();
	}
}
