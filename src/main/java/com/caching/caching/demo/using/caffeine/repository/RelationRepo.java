package com.caching.caching.demo.using.caffeine.repository;

import com.caching.caching.demo.using.caffeine.persistence.Relations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepo extends JpaRepository<Relations,String> {

}
