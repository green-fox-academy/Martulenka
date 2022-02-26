package com.gfa.programmerfoxclub.repository;

import com.gfa.programmerfoxclub.models.Trick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrickRepository extends JpaRepository<Trick, Long> {
}
