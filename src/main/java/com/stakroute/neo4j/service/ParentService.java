package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Parent;
import com.stakroute.neo4j.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    // @Override
    public Parent save(Parent parent) {
        long id = parent.getId();
        String name = parent.getName();
        return parentRepository.createParent(id, name);
    }

    // @Override
    public List<Parent> getAll() {
        return parentRepository.getAllNodes();
    }

    // @Override
    public Parent getOneNode(long id) {
        return parentRepository.getOneParent(id);
    }

    // @Override
    public Parent getOneNode(String name) { return parentRepository.getOneParent(name); }


    // @Override
    public Parent delete(long id) {
        return parentRepository.deleteParent(id);
    }

    // @Override
    public Parent delete(String name) {
        return parentRepository.deleteParent(name);
    }


    // @Override
    public Parent update(Parent parent) {
        long id = parent.getId();
        String name = parent.getName();
        return parentRepository.updateParent(id, name);
    }
}
