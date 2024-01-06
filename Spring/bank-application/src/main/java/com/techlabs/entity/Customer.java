package com.techlabs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")


public class Customer {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long customerId;
	    private String firstName;
	    @Column(nullable = false)
	    private String lastName;
	    @Column(nullable = false)
	    private String email;
	    @Column(nullable = false,unique = true)
	    private String userId;
	    @Column(nullable = false)
	    private String password;
	

}
