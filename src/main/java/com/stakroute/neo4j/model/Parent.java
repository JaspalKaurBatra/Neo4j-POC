package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;

public class Parent {
    @Id
    @GeneratedValue
    private long id;

    @Property
    private String name;
}
