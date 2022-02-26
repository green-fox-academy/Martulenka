package com.gfa.programmerfoxclub.repository;

import com.gfa.programmerfoxclub.models.Fox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends JpaRepository<Fox, Long> {

}
