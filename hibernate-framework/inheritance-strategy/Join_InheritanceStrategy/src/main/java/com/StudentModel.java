package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;


@Entity   
@Table(name="join_table")
@Inheritance(strategy = InheritanceType.JOINED) 
@Data							
public class StudentModel {

	@Id    
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "s_name")
	private String name;
	@Column(name="s_city")
	private String city;

	private int std;
	
	private int enroll;    

	
	
}
