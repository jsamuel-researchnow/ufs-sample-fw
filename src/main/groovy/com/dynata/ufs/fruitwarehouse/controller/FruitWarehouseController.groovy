package com.dynata.ufs.fruitwarehouse.controller

import com.dynata.ufs.fruitwarehouse.service.FruitServiceImpl
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE

@Slf4j
@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
class FruitWarehouseController {

    @Autowired FruitServiceImpl fruitService

    @GetMapping("/fruits")
    ResponseEntity getAllFruits() {
        log.info("GET all fruits")
        return fruitService.getFruits()
    }

    @GetMapping("/")
    String home() {
        return "Home of the Fruit Warehouse"
    }
}
