package cn.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.k8s")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
