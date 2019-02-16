package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Node;

import java.util.List;

public interface CrudService {

    public List<Node> getAll();

    public Node getOneNode(long id);

    public Node getOneNode(String name);

    public Node save(Node node);

    public Node delete(long id);

    public Node delete(String name);

    public Node update(Node node);

}
