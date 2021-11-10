package com.example.springcoredojo;

import com.example.springcoredojo.Usuario.Alumno;
import com.example.springcoredojo.Usuario.Config;
import com.example.springcoredojo.Usuario.Usuario;
import com.example.springcoredojo.Usuario.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			creacionBean();
		};
	}

	public void creacionBean() {

		ApplicationContext context2 = new AnnotationConfigApplicationContext(Config.class);
		Usuario usuarioGenerado = context2.getBean("usuario", Usuario.class);
		System.out.println("Usuario: " + usuarioGenerado);

		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber = context.getBean("youtuber",Youtuber.class);
		System.out.println("Youtuber: "+youtuber);
		//System.out.println(alumno.getApeliido());*/
	}

}
