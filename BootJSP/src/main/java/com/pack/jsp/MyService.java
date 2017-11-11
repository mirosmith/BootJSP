package com.pack.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	private List<User> users;	
	
	public MyService() {		
		this.users = users1;
	}

	private List<User> users1 = new ArrayList<>(Arrays.asList(
			new User("Miro", "Vimperk", "miro@seznam", 24),
			new User("Vlado", "Plzen", "vlado@seznam", 24),
			new User("Iveta", "Pecnov", "ivetae@seznam", 24),
			new User("Kotrba", "Prachatice", "koty@seznam", 24)			
			));

	public List<User> getUsers() {
		return users;
	}
	
	
	
}