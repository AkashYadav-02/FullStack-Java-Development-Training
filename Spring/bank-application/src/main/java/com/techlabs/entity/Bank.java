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
@Table(name = "banks")

public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bankId;
	@Column(nullable = false, unique = true)
	private String bankName;
	@Column(nullable = false)
	private String branch;
	@Column(nullable = false, unique = true)
	private String ifscCode;
	@Column(nullable = false, unique = true)
	private String accounts;

}