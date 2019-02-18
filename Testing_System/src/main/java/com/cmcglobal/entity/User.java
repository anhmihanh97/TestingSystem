package com.cmcglobal.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

<<<<<<< HEAD


=======
>>>>>>> 2d4bae7d8f7061ad3d4c9d9681a81780e80fc97f
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "full_name")
	private String fullName;
	private String email;
	private String mobile;
	private String password;
	private int status;
	@OneToMany(mappedBy = "userCreated", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Exam> exams;
	
//	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinTable(name = "candidate", joinColumns = { @JoinColumn(name = "user_id") },inverseJoinColumns = { @JoinColumn(name = "semester_exam_id") })
//	private List<Semester> semester= new ArrayList<Semester>();

	

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
	@JsonIgnoreProperties("user")
	private List<Candidate> candidates;
	/*
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "candidate", joinColumns = @JoinColumn(name = "user_id"),
	 * inverseJoinColumns = @JoinColumn(name = "semester_exam_id")) private
	 * List<SemesterExam> semesters = new ArrayList<SemesterExam>();
	 */
//
//	public List<SemesterExam> getSemesters() {
//		return semesters;
//	}
//
//	public void setSemesters(List<SemesterExam> semesters) {
//		this.semesters = semesters;
//	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

}
