package com.one.sugarcane.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="COURSE")
public class Course {
	private Integer courseID;
	private String courseName;
	private String courseBrief;
	private double price;
	private int phoneNumber;
	private String introductionImg1;
	private String introductionImg2;
	private String introductionImg3;
        private String teacher;
	private SellerCourseType sellerCourseType;
	private PublicCourseType publicCourseType;
	private SellerLogin sellerLogin;
	private Set<Evaluate>evaluate = new HashSet<Evaluate>();
	private Set<UserCollections>userCollections = new HashSet<UserCollections>();
	@Id
	@GeneratedValue(generator="a")
	@GenericGenerator(name="a",strategy="identity")
	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseBrief() {
		return courseBrief;
	}
	public void setCourseBrief(String courseBrief) {
		this.courseBrief = courseBrief;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIntroductionImg1() {
		return introductionImg1;
	}
	public void setIntroductionImg1(String introductionImg1) {
		this.introductionImg1 = introductionImg1;
	}
	public String getIntroductionImg2() {
		return introductionImg2;
	}
	public void setIntroductionImg2(String introductionImg2) {
		this.introductionImg2 = introductionImg2;
	}
	public String getIntroductionImg3() {
		return introductionImg3;
	}
	public void setIntroductionImg3(String introductionImg3) {
		this.introductionImg3 = introductionImg3;
	}
	@ManyToOne
	@JoinColumn(name="sellerCourseTypeId")
	public SellerCourseType getSellerCourseType() {
		return sellerCourseType;
	}
	
	public void setSellerCourseType(SellerCourseType sellerCourseType) {
		this.sellerCourseType = sellerCourseType;
	}
	@ManyToOne
	@JoinColumn(name="pub_publicTypeId")
	public PublicCourseType getPublicCourseType() {
		return publicCourseType;
	}
	public void setPublicCourseType(PublicCourseType publicCourseType) {
		this.publicCourseType = publicCourseType;
	}
	@ManyToOne
	@JoinColumn(name="sellerID")
	public SellerLogin getSellerLogin() {
		return sellerLogin;
	}
	public void setSellerLogin(SellerLogin sellerLogin) {
		this.sellerLogin = sellerLogin;
	}
	@OneToMany(mappedBy="course",targetEntity=Evaluate.class,cascade=CascadeType.MERGE)
	public Set<Evaluate> getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(Set<Evaluate> evaluate) {
		this.evaluate = evaluate;
	}
	@OneToMany(mappedBy="course",targetEntity=UserCollections.class,cascade=CascadeType.MERGE)
	public Set<UserCollections> getUserCollections() {
		return userCollections;
	}
	public void setUserCollections(Set<UserCollections> userCollections) {
		this.userCollections = userCollections;
	}
	public Course(String courseName, String courseBrief, double price, int phoneNumber, String introductionImg1,
			String introductionImg2, String introductionImg3, SellerCourseType sellerCourseType,
			PublicCourseType publicCourseType, SellerLogin sellerLogin, Set<Evaluate> evaluate,
			Set<UserCollections> userCollections) {
		super();
		this.courseName = courseName;
		this.courseBrief = courseBrief;
		this.price = price;
		this.phoneNumber = phoneNumber;
		this.introductionImg1 = introductionImg1;
		this.introductionImg2 = introductionImg2;
		this.introductionImg3 = introductionImg3;
		this.sellerCourseType = sellerCourseType;
		this.publicCourseType = publicCourseType;
		this.sellerLogin = sellerLogin;
		this.evaluate = evaluate;
		this.userCollections = userCollections;
	}
	
	
}
