package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
public class Parent {

    @Id
    //@GeneratedValue
    private long id;

    @Property
    private String name;

    @Relationship(type = "CHILD_OF", direction = Relationship.INCOMING)
    //private List<Relation> relation;
    private Relation relation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }
}

/*
@NodeEntity
public class Movie {

    @Id @GeneratedValue private Long id;
    private String title;
    private int released;
    private String tagline;

    @JsonIgnoreProperties("movie")
    @Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
    private List<Role> roles;
}

*/