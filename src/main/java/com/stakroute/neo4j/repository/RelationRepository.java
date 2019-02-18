package com.stakroute.neo4j.repository;

import com.stakroute.neo4j.model.Relation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface RelationRepository extends Neo4jRepository<Relation,Long> {

    @Query("MATCH (p:Parent)<-[r:CHILD_OF]-(n:Node) RETURN r")
    Collection<Relation> graph();

    @Query("MATCH (n:Node),(p:Parent) WHERE n.parentId = p.id CREATE (n)-[r:CHILD_OF]->(p) RETURN r")
    Collection<Relation> createRelation();
}
