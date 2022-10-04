package com.dynata.ufs.fruitwarehouse.service

import com.dynata.ufs.fruitwarehouse.model.Fruit
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

    ResponseEntity getFruits() {
        ResponseEntity.ok(getAllFruits())
    }


    private getAllFruits() {
        List rowsResponse = fruitRepository.findAllCount()
        ArrayList< String[] > data = new ArrayList<>();
        int total = 0;

        for(rowResponse in rowsResponse){
            data.add(rowResponse)
        }

        Map<String,Map<String,String>> fruitsOnly = new HashMap<>()

        for (i in 0..<data.size()) {
            String[] row = data.get(i)
            println "row = $row"

            String fruit = row[0]
            fruitsOnly.put(fruit,new HashMap<String, String>())
        }

        for (i in 0..<data.size()) {
            String[] row = data.get(i)
            String fruitName = row[0]
            String color = row[1]
            String count = row[2]
            total += Integer.parseInt(count)

            HashMap<String,String> colorCount= new HashMap<>()
            colorCount.put("count",count)

            fruitsOnly.get(fruitName).put(color,colorCount)
        }

        HashMap<String, HashMap> map = new HashMap()
        map.put("fruits", fruitsOnly)
        map.put("count", total)

        return map
    }

    private Fruit saveFruit(Fruit fruit) {
        fruitRepository.save(fruit)
    }
}
