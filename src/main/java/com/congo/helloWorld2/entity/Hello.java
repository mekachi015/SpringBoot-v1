package com.congo.helloWorld2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

@Entity
@Setter
@Getter

//Long a class in the javascript library as part of the object-oriented library,
//it wraps the long value in an object, the default value is none
//Long - Can be null if not yet persisted
//long - Must always have a value




public class Hello {
    //Every entity needs a primary or else an error will be thrown.

    @Id // must be followed by GeneratedValue and no space in between
    @GeneratedValue
    private Long id; // long a primitive data type used to store a 64-bit integer default value is = 0
    private String text;



}
