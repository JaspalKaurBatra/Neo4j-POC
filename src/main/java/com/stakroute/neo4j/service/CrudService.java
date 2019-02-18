package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.model.Parent;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CrudService {

    public List<Node> getAll();

    public Node getOneNode(long id);

    public Node getOneNode(String name);

    public Node save(Node node);

    public Node delete(long id);

    public Node delete(String name);

    public Node update(Node node);

    public Parent findByName(String name);

    public Collection<Parent> graph();

}
