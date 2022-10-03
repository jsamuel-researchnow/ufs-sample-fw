package com.dynata.ufs.fruitwarehouse.controller

import com.dynata.ufs.fruitwarehouse.service.FruitServiceImpl
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class FruitWarehouseController {

    @Autowired FruitServiceImpl fruitService

    @GetMapping("/fruits")
    ResponseEntity getAllFruits() {
        return fruitService.getFruits()
    }


}
