package br.com.zarpsystem.springrestprometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringRestPrometheusApplication extends SpringBootServletInitializer {

		public static void main(String[] args) {
			SpringApplication.run(SpringRestPrometheusApplication.class, args);
		}

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(SpringRestPrometheusApplication.class);
		}
	}

/*	public static void main(String[] args) {
		SpringApplication.run(SpringRestPrometheusApplication.class, args);
	}*/


