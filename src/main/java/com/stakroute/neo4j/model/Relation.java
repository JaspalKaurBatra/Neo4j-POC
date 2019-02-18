package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "CHILD_OF")  //" 'CHILD OF' "
public class Relation {

    @Id @GeneratedValue
    private long id;

    private List<String> relationship = new ArrayList<>();

    @StartNode
    private Node node;

    @EndNode
    private Parent parent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getRelationship() {
        return relationship;
    }

    public void setRelationship(List<String> relationship) {
        this.relationship = relationship;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
/*
@RelationshipEntity(type = "ACTED_IN")
public class Role {

    @Id @GeneratedValue private Long id;
    private List<String> roles = new ArrayList<>();

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;
}
*/
