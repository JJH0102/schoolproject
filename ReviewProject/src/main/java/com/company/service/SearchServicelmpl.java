package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j;

import com.company.mapper.SearchMapper;
import com.company.model.AddressVO;
import com.company.model.Criteria;

@Service
@Log4j
public class SearchServicelmpl implements SearchService
{
	@Autowired
	private SearchMapper searchmapper;
	
	// 음식점 리스트
	@Override
	public List<AddressVO> addressList(Criteria cri) {
		
		log.info("addressList........");
		
		return searchmapper.addressList(cri);
	}
	
	// 음식점 총 개수
	public int storeGetTotal(Criteria cri) {
		
		log.info("storesGetTotal.........");
		
		return searchmapper.storesGetTotal(cri);
	}
	
	// 음식점 검색
	@Override
	public List<AddressVO> getstoreList(Criteria cri) {
		
		log.info("getstorenameList().......");
		
		String type = cri.getType();
		String[] typeArr = type.split("");
		
		for(String t : typeArr) {
			if(t.equals("A")) {
				String[] storeArr = searchmapper.getstorenameList(cri.getKeyword());
				cri.setStoreArr(storeArr);
			}
		}
		
		return searchmapper.getstoreList(cri);
	}
	
	// 상품 정보
	@Override
	public AddressVO getstoreInfo(String storename) {
		
		AddressVO storeInfo = searchmapper.getstoreInfo(storename);
		
		return storeInfo;
	}		
}
