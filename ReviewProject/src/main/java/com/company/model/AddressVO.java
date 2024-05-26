package com.company.model;

import lombok.Data;

@Data
public class AddressVO 
{
	// 음식점 번호
	private int catecode;
	
	// 음식점 이름
	private String storename;
	
	// 음식점 도로명
	private String road;
	
	// 음식점 지명
    private String address;
    
    // 음식점 경도
    private long mapx;
    
    // 음식점 위도 
    private long mapy;
    
    // 음식점 카테고리
    private String category;
    
    // 음식점 평점
    private float avg_score;
}
