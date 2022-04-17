package com.application.webservice.ApplicationWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TacheService {
    @Autowired
    private TacheRepository tacherepo;

	public List<Tache> getAllTaches() {
		return tacherepo.findAll();
	}
}
