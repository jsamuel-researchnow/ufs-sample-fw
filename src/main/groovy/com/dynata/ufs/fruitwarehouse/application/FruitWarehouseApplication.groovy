package com.dynata.ufs.fruitwarehouse.application


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan("com.dynata.ufs.fruitwarehouse.model")
@EnableJpaRepositories("com.dynata.ufs.fruitwarehouse.persistence")
@ComponentScan(basePackages = ["com.dynata.ufs.fruitwarehouse"])
class FruitWarehouseApplication {

	static void main(String[] args) {
		SpringApplication.run(FruitWarehouseApplication, args)
	}

}