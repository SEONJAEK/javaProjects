package com.javateam.project.member.test;

import com.javateam.project.member.MemberVO.Member;

public class MemberTest {

	public static void main(String[] args) {
		Member member1 = new Member();
		//1.값넣기
		//1.1 setter를 이용해서 값을 넣을 수 있음
		member1.setMemberId("하요선재");
		member1.setMemberPw("1234");
		member1.setMemberName("김선재");
		member1.setMemberAddress("서울시 종로구");
		//1.2생성자 오버로딩을 이용하여 값을 넣을 수 있음
		Member member2 = new Member("헤이선재","1234","김선재","서울시 종로구");
		
		//2.값확인
		//2.1 memberId만 확인해볼때
		System.out.println("member1 id :"+ member1.getMemberId());
		//2.2 전체 확인 할 때
		//System.out.println("member1 : "+  member1.toString());
		System.out.println("member1 : "+  member1);// toString을 써주는 것과 같음
		
		//3.두 객체를 비교
		//3.1  멤버 필드들 동일 여부 비교
		System.out.println(member1.equals(member2));
		//3.2 해쉬코드 비교 
		//두 객체가 동일하면 같은 해쉬코드, 다르면 서로 다른 해쉬코드 나옴
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
	}
}
