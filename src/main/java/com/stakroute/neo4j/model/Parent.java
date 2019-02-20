package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
public class Parent {

    @Id //@GeneratedValue
    private long id;

    @Property
    private String name;

    @Relationship(type = "CHILD_OF", direction = Relationship.INCOMING)
    private List<Relation> relation;
    //private Relation relation;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Relation> getRelation() {
        return relation;
    }
}