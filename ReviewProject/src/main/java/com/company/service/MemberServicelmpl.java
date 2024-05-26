package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.MemberMapper;
import com.company.model.MemberVO;

@Service
public class MemberServicelmpl implements MemberService
{
	@Autowired
	MemberMapper membermapper;
	
	// 회원가입
	@Override
	public void memberJoin(MemberVO member) throws Exception {
		membermapper.memberJoin(member);
	}
	
	// 아이디 중복 확인
	@Override
	public int idCheck(String userid) throws Exception {
		return membermapper.idCheck(userid);
	}
	
	// 로그인
	@Override
    public MemberVO memberLogin(MemberVO member) throws Exception {
        
        return membermapper.memberLogin(member);
    }
}
