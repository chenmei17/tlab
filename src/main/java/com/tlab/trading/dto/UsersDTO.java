package com.tlab.trading.dto;


/* ----------------------------------
 * 회원정보 DTO 
---------------------------------- */

public class UsersDTO {
	private int user_id;
	private String login_id;
	private String password;
	private String name;
	private String affiliation;
	private String email;
	private String created_at;
	private String affil_verify_code;
	private String provider_token;
	private int role_id; // 외래키 
	private int auth_provider_id; // 외래키 
}
