package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//import org.springframework.stereotype.Service;
//
//@Service
public class NodeService implements Service{

    @Autowired
    NodeRepository nodeRepository;

    @Override
    public List<Node> getAll() {
        return nodeRepository.getAllNodes();
    }

    @Override
    public Node save(Node node) {
        int id = node.getId();
        String name = node.getName();
        String parent = node.getParent();
        return nodeRepository.createNode(id, name, parent);
    }

    @Override
    public Node delete(int id) {
        return nodeRepository.deleteNode(id);
    }

    @Override
    public Node update(int id, String name, String parent) {
        return nodeRepository.updateNode(id, name, parent);
    }
}
