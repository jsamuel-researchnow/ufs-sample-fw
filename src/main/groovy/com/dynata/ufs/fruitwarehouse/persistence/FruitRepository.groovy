package com.dynata.ufs.fruitwarehouse.persistence

import com.dynata.ufs.fruitwarehouse.model.Fruit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FruitRepository extends JpaRepository<Fruit, Long> {

}