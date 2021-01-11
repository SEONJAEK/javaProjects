package com.javateam.project.member.MemberVO;

import java.util.Objects;

public class Member {
	//필드부
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberAddress;
	
	//생성자부
	public Member() {
		
	}
	public Member(String memberId, String memberPw, String memberName, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	//메소드 부
		
	@Override
	public String toString() {
		return "member [memberId="+ memberId+",memberPw="+memberPw+",memberName="+memberName
				+",memberAddress="+ memberAddress+"]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberAddress, memberId, memberName, memberPw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberAddress, other.memberAddress) && Objects.equals(memberId, other.memberId)
				&& Objects.equals(memberName, other.memberName) && Objects.equals(memberPw, other.memberPw);
	}
	
	
	
	
}