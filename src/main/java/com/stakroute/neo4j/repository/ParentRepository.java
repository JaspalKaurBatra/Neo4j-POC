package com.stakroute.neo4j.repository;

import com.stakroute.neo4j.model.Parent;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ParentRepository extends Neo4jRepository<Parent,Long> {

    Parent findByName(@Param("name") String name);

    Collection<Parent> findByNameLike(@Param("name") String name);

    @Query("MATCH (p:Parent)<-[r:CHILD_OF]-(n:Node) RETURN p,r,n")
    Collection<Parent> graph();
    /*
    Movie findByTitle(@Param("title") String title);

    Collection<Movie> findByTitleLike(@Param("title") String title);

    @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT {limit}")
    Collection<Movie> graph(@Param("limit") int limit);
    */
}
