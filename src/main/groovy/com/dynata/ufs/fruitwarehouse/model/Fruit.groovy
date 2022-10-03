package com.dynata.ufs.fruitwarehouse.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Fruit {

    @Id
    @GeneratedValue
    Long id

    @Column
    String fruitName
    @Column
    String color


}
