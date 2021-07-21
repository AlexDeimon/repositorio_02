package springJob;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CTestEmploTask {   // Text Employee Tasks

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext Employee = new ClassPathXmlApplicationContext("applicationContext.xml");
		ItEmployee Erika = Employee.getBean("EmploGene", ItEmployee.class);
		System.out.println(Erika.mtdGetTask());
		Employee.close();
	}
}