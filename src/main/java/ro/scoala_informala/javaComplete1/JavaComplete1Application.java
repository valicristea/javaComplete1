package ro.scoala_informala.javaComplete1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaComplete1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JavaComplete1Application.class, args);
		applicationContext.getBeanDefinitionNames();
	}

}
