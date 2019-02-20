package com.stakroute.neo4j.repository;

import com.stakroute.neo4j.model.Parent;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ParentRepository extends Neo4jRepository<Parent,Long> {

    @Query("MATCH (Parent) RETURN Parent")
    List<Parent> getAllNodes();

    @Query("MATCH (p:Parent) WHERE p.id={id} RETURN p")
    Parent getOneParent(@Param("id") long id);   //by id

    @Query("MATCH (p:Parent) WHERE p.name={name} RETURN p")
    Parent getOneParent(@Param("name") String name); //by name

    @Query("CREATE (p:Parent) SET p.id={id},p.name={name} RETURN p")
    Parent createParent(long id,String name);

    @Query("MATCH (p:Parent) WHERE p.id={id} DETACH DELETE p RETURN p ")
    Parent deleteParent(@Param("id") long id);  //by id

    @Query("MATCH (p:Parent) WHERE p.name={name} DETACH DELETE p RETURN p ")
    Parent deleteParent(@Param("name") String name);  //by name

    @Query("MATCH (p:Parent) WHERE p.id={id} SET p.name={name} RETURN p")
    Parent updateParent(@Param("id") long id,@Param("name") String name);

}
