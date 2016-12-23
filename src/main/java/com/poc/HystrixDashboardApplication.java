package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 
 * @author joliveros
 *
 *	this is a service that monitors lag for service requests
 *
 *	how to use:
 *		Ex - visit http://phmadjoliveros1.infor.com:8009/hystrix.html
 *
 *		put the target edge service in the input of the hystrix.html to view
 *		Ex - http://phmadjoliveros1.infor.com:8011/hystrix.stream (where this is the path of edge service)
 *
 */
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}
}
