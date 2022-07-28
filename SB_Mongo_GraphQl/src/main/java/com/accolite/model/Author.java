package com.accolite.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "authors")
public class Author {
	@Id
	private String id;
	private String name;
	private Integer age;
	
	public Author(String id) {
	    this.id = id;
	  }

}
