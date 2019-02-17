package com.stakroute.neo4j.repository;

import com.stakroute.neo4j.model.Node;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends Neo4jRepository<Node,Long> {

    @Query("MATCH (Node) RETURN Node")
    List<Node> getAllNodes();

    @Query("MATCH (n:Node) WHERE n.id={id} RETURN n")
    Node getOneNode(@Param("id") long id);   //by id

    @Query("MATCH (n:Node) WHERE n.name={name} RETURN n")
    Node getOneNode(@Param("name") String name); //by name

    @Query("CREATE (n:Node) SET n.id={id},n.name={name},n.parentId={parentId} RETURN n")
    Node createNode(long id,String name, long parentId);

    @Query("MATCH (n:Node) WHERE n.id={id} DETACH DELETE n RETURN n ")
    Node deleteNode(@Param("id") long id);  //by id

    @Query("MATCH (n:Node) WHERE n.name={name} DETACH DELETE n RETURN n ")
    Node deleteNode(@Param("name") String name);  //by name

    @Query("MATCH (n:Node) WHERE n.id={id} SET n.name={name},n.parentId={parentId} RETURN n")
    Node updateNode(@Param("id") long id,@Param("name") String name,@Param("parentId") long parentId);
}
