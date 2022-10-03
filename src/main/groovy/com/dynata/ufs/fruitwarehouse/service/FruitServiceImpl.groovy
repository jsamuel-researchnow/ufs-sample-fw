package com.dynata.ufs.fruitwarehouse.service

import com.dynata.ufs.fruitwarehouse.persistence.FruitRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class FruitServiceImpl implements FruitService {

    FruitRepository fruitRepository

    @Autowired
    FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository
    }

    static ResponseEntity getFruits() {
        ResponseEntity.ok("return all fruits")
    }
}
