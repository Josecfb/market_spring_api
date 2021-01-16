package com.jose.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jose.market.persistence.mapper.ProductMapper;

//@SpringBootApplication(scanBasePackage={"com.jose.market.persistence.mapper.ProductMapper"})
@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}
