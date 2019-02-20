package com.stakroute.neo4j.service;

import com.stakroute.neo4j.model.Relation;
import com.stakroute.neo4j.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RelationService {

    @Autowired
    RelationRepository relationRepository;

    public List<Relation> create(){
        return relationRepository.createRelation();
    }

    public List<Relation> getAll(){
        return relationRepository.getAllRelations();
    }

    public Relation deleteAllRelationships() {
        return relationRepository.deleteAllRelationships();
    }

    /*public Relation update(){//Relation parent) {
        // long id = parent.getId();
        // String name = parent.getName();
        return relationRepository.updateRelation();
    }*/

      /*
    public Relation delete(long id) {
        return relationRepository.deleteRelation(id);
    }
    */

}
