package com.stakroute.neo4j.service;
import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NodeService implements CrudService{

    @Autowired
    NodeRepository nodeRepository;

    @Override
    public List<Node> getAll() {
        return nodeRepository.getAllNodes();
    }

    @Override
    public Node getOneNode(long id) {
        return nodeRepository.getOneNode(id);
    }

    @Override
    public Node getOneNode(String name) {
        return nodeRepository.getOneNode(name);
    }

    @Override
    public Node save(Node node) {
        long id = node.getId();
        String name = node.getName();
        String parent = node.getParent();
        return nodeRepository.createNode(id, name, parent);
    }

    @Override
    public Node delete(long id) {
        return nodeRepository.deleteNode(id);
    }       //but I am not returning the deleted node as I am not able to keep track of the same

    @Override
    public Node delete(String name) {
        return nodeRepository.deleteNode(name);
    }

    @Override
    public Node update(Node node) {
        long id = node.getId();
        String name = node.getName();
        String parent = node.getParent();
        return nodeRepository.updateNode(id, name, parent);
    }
}
