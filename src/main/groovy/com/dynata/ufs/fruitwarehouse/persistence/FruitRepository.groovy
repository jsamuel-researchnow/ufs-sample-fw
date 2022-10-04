package com.dynata.ufs.fruitwarehouse.persistence

import com.dynata.ufs.fruitwarehouse.model.Fruit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query(value = "select fruit_name, color, count(color) from fruit group by fruit_name, color", nativeQuery = true)
    List findAllCount()

}