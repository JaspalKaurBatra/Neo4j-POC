package com.stakroute.neo4j.service;


import com.stakroute.neo4j.model.Node;

import java.util.List;

public interface Service {
    List<Node> getAll();

    Node save(Node node);

    Node delete(int id);

    //Node deleteByName(String name);
    //Node deleteById(int id);
    //Node deleteByParent(String parent);

    Node update(int id, String name, String parent);
}
