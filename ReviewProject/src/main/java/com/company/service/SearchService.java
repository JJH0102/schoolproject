package com.company.service;

import java.util.List;

import com.company.model.AddressVO;
import com.company.model.Criteria;

public interface SearchService 
{
	// 음식점 리스트
	public List<AddressVO> addressList(Criteria cri);
	
	// 음식점 총 개수
	public int storeGetTotal(Criteria cri);
	
	// 음식점 검색
	public List<AddressVO> getstoreList(Criteria cri);
	
	// 상품 정보
	public AddressVO getstoreInfo(String storename);	
	
}
