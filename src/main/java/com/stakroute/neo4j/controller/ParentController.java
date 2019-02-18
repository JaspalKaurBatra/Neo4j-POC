package com.stakroute.neo4j.controller;

import com.stakroute.neo4j.model.Parent;
import com.stakroute.neo4j.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/parent")
public class ParentController {

    @Autowired
    ParentService parentService;

    @GetMapping("/get")
    public List<Parent> getAll(){
        return parentService.getAll();
    }

    @PostMapping("/save")
    public Parent save(@RequestBody Parent node){
        return parentService.save(node);
    }

    @DeleteMapping("/delete/{id}")
    public Parent delete(@PathVariable("id") long id){
        return parentService.delete(id);
    }

    @PutMapping("/update")
    public Parent update(@RequestBody Parent node)
    {
        return parentService.update(node);
    }

}
