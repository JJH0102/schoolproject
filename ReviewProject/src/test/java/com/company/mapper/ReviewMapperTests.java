package com.company.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.model.ReviewDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReviewMapperTests 
{
	@Autowired
	private ReviewMapper mapper;
	
	@Test
	public void replyEnrollTest() {
		
		String id = "admin";
		String name = "떡볶이 가게";
		String content = "댓글 테스트";
		double rating = 3.5;
		
		ReviewDTO dto = new ReviewDTO();
		dto.setUserid(id);
		dto.setStorename(name);
		dto.setWriting(content);
		dto.setScore(rating);
		
		mapper.enrollReply(dto);		
	}
}
