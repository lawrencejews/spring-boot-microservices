package com.lawrencejews.gameusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@SpringBootApplication
public class GameUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameUsersApplication.class, args);
	}

}
