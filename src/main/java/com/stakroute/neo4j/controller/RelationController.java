package com.stakroute.neo4j.controller;

import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.model.Parent;
import com.stakroute.neo4j.model.Relation;
import com.stakroute.neo4j.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/relation")
public class RelationController {

    @Autowired
    RelationService relationService;

    @GetMapping("/create")
    public List<Relation> create(){
        return relationService.create();
    }

    @GetMapping("/get")
    public List<Relation> getAll() {
        return relationService.getAll();
    }

    @DeleteMapping("/delete")
    public Relation delete(){
        return relationService.deleteAllRelationships();
    }

    /*@DeleteMapping("/delete/{id}")
    public Relation delete(@PathVariable("id") long id){
        return relationService.delete(id);
    }
    */
    /*
    @PutMapping("/update")
    public Parent update(@RequestBody Parent node)
    {
        return parentService.update(node);
    }
    */

}

