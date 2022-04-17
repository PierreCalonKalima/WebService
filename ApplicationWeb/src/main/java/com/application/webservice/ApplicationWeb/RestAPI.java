package com.application.webservice.ApplicationWeb;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class RestAPI {
  @Autowired
  private final TacheService tache;
  @Autowired
  private final UsersService users;

  RestAPI(TacheService tache, UsersService users){
    this.tache = tache;
    this.users = users;
  }
  
 /* @RequestMapping(method=RequestMethod.POST,value="/tache")
  public void createTache(@RequestBody Tache tache){
    tache.createTache(tache);
  }
  @RequestMapping(method=RequestMethod.DELETE,value="/tache/{pseudo}")
  public void deleteTache(@PathVariable String pseudo){
    tache.deleteTache(pseudo);
  }*/
  @RequestMapping("/Taches")
  public List<Tache> getAllTache() { 
    return tache.getAllTaches();
  }

  @RequestMapping(method=RequestMethod.POST,value="/user")
  public void createUser(@RequestBody Users user){
    users.createUser(user);
  }

  @RequestMapping("/users/{pseudo}")
  public Users getUser(@PathVariable String pseudo){
    return users.getUser(pseudo);
  }
}
