package com.application.webservice.ApplicationWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Long> {
    
}
