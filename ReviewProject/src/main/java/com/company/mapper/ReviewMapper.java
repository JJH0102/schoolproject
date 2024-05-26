package com.company.mapper;

import com.company.model.ReviewDTO;

public interface ReviewMapper 
{
	// 댓글 작성
	public int enrollReply(ReviewDTO dto);
}
