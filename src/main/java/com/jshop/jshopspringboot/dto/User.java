package com.jshop.jshopspringboot.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "user")
	private List<UserCart> userCarts;
}
