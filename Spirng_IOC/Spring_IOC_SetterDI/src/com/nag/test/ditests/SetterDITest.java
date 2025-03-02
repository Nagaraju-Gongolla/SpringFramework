package com.nag.test.ditests;

import com.nag.beans.dibeans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDITest {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/nag/resources/setterDiresources/setterDIConfig.xml");
		Car c = (Car)apc.getBean("c");
		c.display();

		CollectionDI collectionDI =(CollectionDI)apc.getBean("collectionDI");
		collectionDI.printData();

		/*ChildCollectionDI childCollectionDI = (ChildCollectionDI)apc.getBean("childCollectionDI");
		childCollectionDI.printData();*/

		Question q = (Question) apc.getBean("q");
		q.displayInfo();

		// Properties Dependency injection
		/*ConnectionPool connectionPool =(ConnectionPool) apc.getBean("connectionPool");
		connectionPool.printData();*/

		// Secondery type Arrat DI
		ArrayDI car = (ArrayDI)apc.getBean("car");
		car.printcarData();
	}
}