package com.jshop.jshopspringboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class User {
	
	@Id
	private int userId;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userPassword;
	
	
}
