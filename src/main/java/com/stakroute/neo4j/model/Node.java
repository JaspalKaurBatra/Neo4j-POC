package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.*;

import javax.annotation.Generated;

@NodeEntity
public class Node {

    @Id
    private long id;

    @Property
    private String name;

    @Property
    private String parent;

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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }


}
