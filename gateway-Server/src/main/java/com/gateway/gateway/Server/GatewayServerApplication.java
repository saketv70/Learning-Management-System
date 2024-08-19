package com.gateway.gateway.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class GatewayServerApplication {
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder)
	{
		return builder.routes().
				route(p -> p
						.path("/lms/query/**")
						.filters(f -> f.rewritePath("/lms/query/(?<segment>.*)", "/${segment}"))
						.uri("lb://QUERY")
				).
				route(p -> p
						.path("/lms/employee/**")
						.filters(f -> f.rewritePath("/lms/employee/(?<segment>.*)", "/${segment}"))
						.uri("lb://EMPLOYEE")
				).route(p -> p
						.path("/lms/courses/**")
						.filters(f -> f.rewritePath("/lms/courses/(?<segment>.*)", "/${segment}"))
						.uri("lb://COURSES")
				).
				build();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

}
