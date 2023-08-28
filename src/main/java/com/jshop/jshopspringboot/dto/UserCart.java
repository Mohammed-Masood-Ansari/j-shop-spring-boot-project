package com.jshop.jshopspringboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCart {

	@Id
	private int  cartId;
	private int productId;
	private String productName;
	private double productTotalPrice;
	private String brandName;
	private int productQuantity;
}
