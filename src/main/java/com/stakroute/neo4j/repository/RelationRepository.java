package com.stakroute.neo4j.repository;
import com.stakroute.neo4j.model.Relation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.List;

public interface RelationRepository extends Neo4jRepository<Relation,Long> {

    @Query("MATCH p=()-[r:CHILD_OF]->() RETURN p")
    List<Relation> getAllRelations();

    //@Query("MATCH (n:Node),(p:Parent) WHERE n.parentId = p.id CREATE (n)-[r:CHILD_OF]->(p) RETURN n,p,r")
    @Query("MATCH (n:Node),(p:Parent) WHERE n.parentId = p.id CREATE x=(n)-[r:CHILD_OF]->(p) RETURN x")
    List<Relation> createRelation();

    @Query("MATCH ()-[r:CHILD_OF]-() DETACH DELETE r")
    Relation deleteAllRelationships();

    /*@Query("MATCH (n:Node)-[r]->(p:Parent) WHERE r.id={id} DETACH DELETE r RETURN r.id,r.node,r.parent ")
    Relation deleteRelation(@Param("id") long id);  //by id*/

   /* @Query("MATCH ()-[r]->() WHERE relationship(r)= 0 RETURN r ")
    Relation updateRelation();//@Param("id") long id);  //by id */
}

