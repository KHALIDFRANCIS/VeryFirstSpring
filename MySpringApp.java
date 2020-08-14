package springpackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	
	public static void main (String[] args) {
	
		
		//load the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext ("applicationContext.xml");
//		"applicationContext.xml" is the name of the config file		
				
		
		//retreive bean from the spring container
				 MasterCoach theCoach = context.getBean("MyCoach", MasterCoach.class);
		
		//call the method on the bean
				 System.out.println(theCoach.getDailyWorkout());
		
		//close the context
				 context.close();
	}
	}


//the package name in the root folder has to be the name of the bean class







