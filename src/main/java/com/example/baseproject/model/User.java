package com.example.baseproject.model;

/*import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
*/

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
//@Data
//@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class User {
  //  @Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	private String nome;

	private String username;

}
