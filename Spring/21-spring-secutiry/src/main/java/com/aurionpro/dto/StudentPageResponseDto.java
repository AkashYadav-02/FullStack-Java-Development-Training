package com.aurionpro.dto;

import java.util.List;

import com.aurionpro.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentPageResponseDto {

	  private List<Student> content;
	  private int elementsOnPage;
	  private int TotalPages;
	  private boolean hasNext;
	  private boolean hasPrevious;
	  private int currentPageNumber;
	  private long totalElements;

}
