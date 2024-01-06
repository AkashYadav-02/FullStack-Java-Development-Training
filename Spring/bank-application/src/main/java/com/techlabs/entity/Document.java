package com.techlabs.entity;

import java.util.Date;

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
@Table(name = "documents")

public class Document {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long  documentId;
	   
	    @Column(nullable = false)
	    private String  title;
	    @Column(nullable = false)
	    private Date  upload_date;
	    @Column(nullable = false)
	    private String documentUrl;
	

}
