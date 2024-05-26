package com.company.model;

import java.util.Date;

public class ReviewDTO 
{
	// 리뷰 글 id
	private int reviewId;
	
	// 유저 id
	private String userid;
	
	// 가게 이름
	private String storename;
	
	// 리뷰 내용
	private String writing;
	
	// 식당 별점
	private double score;
	
	// 리뷰 작성한 날짜
	private Date review_date;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getReview_date() {
		return review_date;
	}

	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}

	@Override
	public String toString() {
		return "ReviewDTO [reviewId=" + reviewId + ", userid=" + userid + ", storename=" + storename + ", writing="
				+ writing + ", score=" + score + ", review_date=" + review_date + "]";
	}
}
