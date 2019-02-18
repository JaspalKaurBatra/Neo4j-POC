package com.stakroute.neo4j.controller;

import com.stakroute.neo4j.model.Relation;
import com.stakroute.neo4j.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/relation")
public class RelationController {

    @Autowired
    RelationService relationService;

    @GetMapping("/save")
    public Collection<Relation> save(){
        return relationService.save();
    }

    @GetMapping("/graph")
    public Collection<Relation> graph() {
        return relationService.graph();
    }
}

