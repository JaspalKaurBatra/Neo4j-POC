package com.stakroute.neo4j.controller;

import com.stakroute.neo4j.model.Node;
import com.stakroute.neo4j.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class NodeController {

    @Autowired
    NodeService nodeService;

    @GetMapping("/get")
    public List<Node> getAll(){
        return nodeService.getAll();
    }

    @PostMapping("/save")
    public Node save(@RequestBody Node node){
        return nodeService.save(node);
    }

    @DeleteMapping("/delete")
    public Node delete(@RequestParam("id") int id){
        return nodeService.delete(id);
    }

    @PutMapping("/update")
    public Node update(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("parent") String parent)
    {
        return nodeService.update(id, name, parent);
    }

}
