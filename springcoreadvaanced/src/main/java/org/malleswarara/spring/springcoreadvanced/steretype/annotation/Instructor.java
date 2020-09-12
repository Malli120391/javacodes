package org.malleswarara.spring.springcoreadvanced.steretype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("init")
@Scope("prototype")
public class Instructor {
	
	@Value("#{10+10}")
	private int id;
	@Value("Malleswarara Rao")
	private String name;
	
	@Value("#{listitems}")
	private List<String> listitemstest;
	
	@Autowired
	private Profile profile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", listitemstest=" + listitemstest + ", profile=" + profile
				+ "]";
	}
	
	

}
