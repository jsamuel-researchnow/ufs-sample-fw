package com.dynata.ufs.fruitwarehouse.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import java.sql.Timestamp

@Entity
class Fruit {

    @Id
    @GeneratedValue
    Long id

    @Column(name = "fruit_name", nullable = false)
    String fruitName

    @Column(nullable = false)
    String color

    @Column(name = "date_created")
    Timestamp dateCreated
}
