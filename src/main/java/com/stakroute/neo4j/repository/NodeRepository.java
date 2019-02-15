package com.stakroute.neo4j.repository;

import com.stakroute.neo4j.model.Node;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends Neo4jRepository<Node,Integer> {

    @Query("MATCH (Node) RETURN Node")
    List<Node> getAllNodes();

    @Query("MATCH (Node) RETURN Node")
    Node getOneNode();

    @Query("CREATE (n:Node) SET n.id={id},n.name={name},n.parent={parent} RETURN n")
    Node createNode(int id,String name, String parent);

    @Query("MATCH (n) WHERE id(n)={id} DETACH DELETE n RETURN 'node deleted' ")
    Node deleteNode(@Param("id") int id);  //by id

    @Query("MATCH (n) WHERE id(n)={id} SET n.name={name},n.parent={parent} RETURN n")
    Node updateNode(@Param("id") int id,@Param("name") String name,@Param("parent") String parent);

}
