package com.bhavin.restdemo;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("person")
public class PersonResource {

	PersonRepository pr = new PersonRepository();
//	@GET 
//    @Produces(MediaType.APPLICATION_ATOM_XML)
//	public Person getPerson() {
//		Person p1 = new Person();
//		p1.setName("Bhavin");
//	    p1.setPoints(65);
//	    
//	    return p1;
//	}
	
	
//	@GET 
//    @Produces(MediaType.APPLICATION_ATOM_XML)
//	public List<Person> getPerson() {
//		Person p1 = new Person();
//		p1.setName("Bhavin");
//	    p1.setPoints(65);
//	    
//	    Person p2 = new Person();
//		p2.setName("Ravi");
//	    p2.setPoints(75);
//	    
//	    List<Person> list = Arrays.asList(p1,p2);
//	    return list;
//	}
	
	
	@GET 
    @Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Person> getPerson() {
	
	    return pr.getAllUsers();
	}
}
