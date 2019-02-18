package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Relation;
import com.stakroute.neo4j.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RelationService {

    @Autowired
    RelationRepository relationRepository;

    public Collection<Relation> save(){
        return relationRepository.createRelation();
    }

    public Collection<Relation> graph(){
        return relationRepository.graph();
    }
}
