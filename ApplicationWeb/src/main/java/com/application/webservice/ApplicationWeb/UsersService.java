package com.application.webservice.ApplicationWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersrepo;

    public Users getUser(String pseudo){
        for (Users user : usersrepo.findAll()){
            if(pseudo == user.getPseudo()){
                return user;
            }
        }
        return new Users();
   }
    
   public void createUser(Users user){
       usersrepo.save(user);
   }
}
