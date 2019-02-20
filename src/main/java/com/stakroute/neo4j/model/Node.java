package com.stakroute.neo4j.model;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class Node {

    @Id //@GeneratedValue
    private long id;

    @Property
    private String name;

    @Property
    private long parentId;

    @Relationship(type = "CHILD_OF", direction = Relationship.OUTGOING)
    private List<Parent> parent = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getParentId() {
        return parentId;
    }

    public List<Parent> getParent() {
        return parent;
    }

}
/*
@NodeEntity
public class Person {

    @Id @GeneratedValue private Long id;
    private String name;
    private int born;

    @Relationship(type = "ACTED_IN")
    private List<Movie> movies = new ArrayList<>();
}
*/