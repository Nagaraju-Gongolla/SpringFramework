package com.nag.test.containerstests;

import com.nag.beans.containers.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ContainersTest {

    public static void main(String[] args) {
        Resource resource = null;
		BeanFactory beanFactory = null;
		Student student = null;
		Student student1 = null;

		// Using Core Container BeanFactory
        System.out.println("===== Core Container ====");

		// locate SpringBean config file
		// we have two resources 1.FilesystemResource("path"),
		// 2.ClassPathResource("path")
        resource = new ClassPathResource("com/nag/resources/containers/applicationContext.xml");

		// create IOC container (BeanFactory)
        beanFactory = new XmlBeanFactory(resource);

		// checking bean available in container
        boolean isBeanAvailable = beanFactory.containsBean("student1");

		if(isBeanAvailable){
			// we can get bean from container in two ways by passing bean id
			// or by passing bean id and ClassName.class in getBean()
			student = (Student) beanFactory.getBean("student1");
			student1 = beanFactory.getBean("student1", Student.class);
		}

		// invoke business method
        student.displayInfo();
        student1.displayInfo();

		// checking is bean is singleton or not (default spring bean scope is singleton)
		// if we specify scope is singleton in config file
		// it will create only one bean object for entire application and refers the same object where ever using it
        System.out.println("chekcing singletone beans student == student1 : ");
        System.out.println(student == student1);

        // Using J2EE Container ApplicationContext
        System.out.println("=====J2EE Container====  ApplicationContext");
        ApplicationContext apc = new ClassPathXmlApplicationContext("com/nag/resources/containers/applicationContext.xml");

        Student prototypeStudent1 = (Student) apc.getBean("student2");
        Student prototypeStudent2 = apc.getBean("student2", Student.class);
        prototypeStudent1.displayInfo();
        System.out.println("checking prototype beans prototypeStudent1 == prototypeStudent2 : ");
        System.out.println(prototypeStudent1 == prototypeStudent2);


    }

}
