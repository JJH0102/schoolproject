package com.company.controlller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.company.model.AddressVO;
import com.company.model.Criteria;
import com.company.model.PageDTO;
import com.company.service.SearchService;

@Controller
@RequestMapping(value = "/address")
public class SearchController 
{
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	private SearchService searchService;
	
	//검색 페이지 이동
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String SearchGET(Criteria cri, Model model) throws Exception {
		
		/* 음식점 리스트 데이터 */
		List list = searchService.addressList(cri);
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
		}
						
		return "search";
	}	
}
