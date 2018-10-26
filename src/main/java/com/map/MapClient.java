package com.map;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class MapClient {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();

		Person person = new Person(1, "raj");
		Person person1 = new Person(2, "raj");
		map.put(person, 1);
		map.put(person1, 2);
		System.out.println(map);
	}

}

@Getter
@Setter
@AllArgsConstructor
class Person {
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return id+"" ;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Person)obj).name);
	}
	@Override
	public int hashCode() {
		return 1;
	}

}