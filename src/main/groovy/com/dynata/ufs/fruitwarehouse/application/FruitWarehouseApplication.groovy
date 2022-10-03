package com.dynata.ufs.fruitwarehouse.application


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.repository.config.BootstrapMode

@SpringBootApplication
@EnableJpaRepositories(bootstrapMode = BootstrapMode.DEFAULT, basePackages = "com.dynata.ufs.fruitwarehouse.model")
class FruitWarehouseApplication {

	static void main(String[] args) {
		SpringApplication.run(FruitWarehouseApplication, args)
	}

}