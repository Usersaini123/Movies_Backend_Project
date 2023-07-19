package com.vivek.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movies")
public class Movies {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	private String name;
	private String description;
	private String category;
	private String image;
	private String actor;
	
}
