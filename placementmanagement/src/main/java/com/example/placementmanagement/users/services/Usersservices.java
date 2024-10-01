package com.example.placementmanagement.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.users.entity.Users;
import com.example.placementmanagement.users.repository.Usersrepo;

@Service
public class Usersservices {
@Autowired
private Usersrepo ur;
//create
public Users registeruser(Users u) {
	return ur.save(u);
}

//read 

public List<Users> getuser(){
	return (List<Users>)ur.findAll();
	
}
//delete
public void deleteuser(Integer id) {
	ur.deleteById(id);
}
	
//update

public Users updateusers(Integer id,Users e)
{
	return ur.save(e);
}
	
	
	
}

