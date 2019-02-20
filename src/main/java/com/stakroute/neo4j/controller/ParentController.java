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

    @GetMapping("/get/id/{id}")
    public Parent getOneNode(@PathVariable("id") long id){
        return parentService.getOneNode(id);
    }

    @GetMapping("/get/name/{name}")
    public Parent getOneNode(@PathVariable("name") String name){
        return parentService.getOneNode(name);
    }

    @PostMapping("/save")
    public Parent save(@RequestBody Parent node){
        return parentService.save(node);
    }

    @DeleteMapping("/delete/id/{id}")
    public Parent delete(@PathVariable("id") long id){
        return parentService.delete(id);
    }

    @DeleteMapping("/delete/name/{name}")
    public Parent delete(@PathVariable("name") String name){ return parentService.delete(name); }

    @PutMapping("/update")
    public Parent update(@RequestBody Parent node)
    {
        return parentService.update(node);
    }

}
