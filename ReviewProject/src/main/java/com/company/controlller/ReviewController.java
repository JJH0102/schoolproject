package com.company.controlller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.service.ReviewService;
import com.company.model.ReviewDTO;

@RestController
@RequestMapping(value = "/review")
public class ReviewController 
{
	@Autowired
	private ReviewService reviewService;
	
	// 리뷰 등록
	@PostMapping("/enroll")
	public void enrollReplyPOST(ReviewDTO dto) {
		reviewService.enrollReply(dto);
	}
}
