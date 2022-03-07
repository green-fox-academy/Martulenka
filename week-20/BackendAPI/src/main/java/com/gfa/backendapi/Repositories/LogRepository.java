package com.gfa.backendapi.Repositories;

import com.gfa.backendapi.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
