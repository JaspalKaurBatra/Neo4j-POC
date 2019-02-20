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

}