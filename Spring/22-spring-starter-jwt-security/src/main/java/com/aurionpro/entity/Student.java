package com.aurionpro.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	private String email;
	
//	@JoinTable(name = "student_course",
//			joinColumns = {@JoinColumn(name="student_id")},
//			inverseJoinColumns = {@JoinColumn(name = "course_id")}
//			)
//	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//	@JsonManagedReference
//	private List<Course> courses;

	public Student(String firstName, String lastName, String email) {
		super();
		this.fName = firstName;
		this.lName = lastName;
		this.email = email;
	}
	
	

}
