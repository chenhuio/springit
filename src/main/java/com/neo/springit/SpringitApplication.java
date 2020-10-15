package com.neo.springit;

import com.neo.springit.config.SpringitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

	@Autowired
	private SpringitProperties springitProperties;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			System.out.println("Neo's welcome message: " + springitProperties.getWelcomeMsg());
//		};
//	}

	@Bean
	@Profile("dev")
	CommandLineRunner runner() {
		return args -> {
			System.out.println("This is only for dev");
			System.out.println("Printing out all the bean names in the application context");
			System.out.println("----------------------------------------------------------");
			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);

			for (String bean: beans) {
				System.out.println(bean);
			}
		};
	}

}
