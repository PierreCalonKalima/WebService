package com.application.webservice.ApplicationWeb;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
    
}
