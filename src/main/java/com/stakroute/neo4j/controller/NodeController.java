package com.stakroute.neo4j.controller;

import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/child")
public class NodeController {

    @Autowired
    NodeService nodeService;

    @GetMapping("/get")
    public List<Node> getAll(){
        return nodeService.getAll();
    }

    @GetMapping("/get/{id}")
    public Node getOneNode(@PathVariable("id") long id){
        return nodeService.getOneNode(id);
    }

    @GetMapping("/get/{name}")
    public Node getOneNode(@PathVariable("name") String name){
        return nodeService.getOneNode(name);
    }

    @PostMapping("/save")
    public Node save(@RequestBody Node node){
        return nodeService.save(node);
    }

    @DeleteMapping("/delete/{id}")
    public Node delete(@PathVariable("id") long id){
        return nodeService.delete(id);
    }

    @DeleteMapping("/delete/{name}")
    public Node delete(@PathVariable("name") String name){
        return nodeService.delete(name);
    }

    @PutMapping("/update")
    public Node update(@RequestBody Node node)
    {
        return nodeService.update(node);
    }

   /* @PutMapping("/update")
    public Node update(@RequestParam("id") long id,@RequestParam("name") String name,@RequestParam("parent") String parent)
    {
        return nodeService.update(id, name, parent);
    }*/

}
