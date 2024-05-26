package com.company.mapper;

import java.util.List;

import com.company.model.AddressVO;
import com.company.model.Criteria;

public interface SearchMapper 
{
	// 음식점 리스트
	public List<AddressVO> addressList(Criteria cri);
	
	// 음식점 총 개수
	public int storesGetTotal(Criteria cri);
	
	// 음식점 검색
	public List<AddressVO> getstoreList(Criteria cri);
	
	// 음식점 이름 리스트 요청
	public String[] getstorenameList(String keyword);
	
	// 음식점 정보
	public AddressVO getstoreInfo(String storename);	
}
