package com.bhavin.restdemo;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

	List<Person> users;
	
	public PersonRepository() {
		users = new ArrayList();
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setName("Bhavin");
	    p1.setPoints(65);
	    
	    Person p2 = new Person();
		p2.setId(102);
	    p2.setName("Ravi");
	    p2.setPoints(75);
	    
	    users.add(p1);
	    users.add(p2);
	}
	
	public List<Person> getAllUsers(){
		return users;
	}
	
	public Person getPersonById(int id) {
		Person p = null;
		for(Person p1 : users) {
			if(p1.getId() == id) {
				return p1;
			}
		}
		return null;
	}
}
