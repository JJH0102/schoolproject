package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.ReviewMapper;
import com.company.model.ReviewDTO;

@Service
public class ReviewServicelmpl implements ReviewService
{
	@Autowired
	private ReviewMapper reviewMapper;
	
	// 리뷰 등록
	@Override
	public int enrollReply(ReviewDTO dto) {
		
		int result = reviewMapper.enrollReply(dto);
		
		return result;
	}
}
