package com.tp.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentReviews")
public class Review {
	@Id
	@GeneratedValue
	@Column(name = "studReview_id")
	long id;
	
	@Column(name = "studReview_rating",length = 5,nullable = false)
	String rating;
	
	@Column(name = "studReview_description",length = 256)
	String description;

	public Review() {
		super();
	}

	public Review(long id, String rating, String description) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
	}

	public Review(String rating, String description) {
		super();
		this.rating = rating;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", description=" + description + "]";
	}
	
}
