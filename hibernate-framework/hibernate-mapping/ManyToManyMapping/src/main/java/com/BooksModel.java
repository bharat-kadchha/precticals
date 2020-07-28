package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "books_name")
@Data

public class BooksModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String bName;
	private int prize;

	@ManyToMany(mappedBy = "book") // mappedBy for crate one table.extra
	private List<StudentModel> stds;

}
