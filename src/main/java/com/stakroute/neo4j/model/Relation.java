package com.stakroute.neo4j.model;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "CHILD_OF")  //" 'CHILD OF' "
public class Relation {

    @Id @GeneratedValue
    private List<String> relationship = new ArrayList<>();

    @StartNode
    private Node node;

    @EndNode
    private Parent parent;

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
