package com.kaynak.gift.giftservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaynak.gift.giftservice.model.Gift;

@RestController
public class Service {

	@RequestMapping("/gift")
	public Gift getGift(String id) {
		System.out.println(String.format("id : %s ", id));
		Gift gift = new Gift();
		gift.setCompany("Boyner");
		gift.setExpireDay((byte)2020);
		gift.setExpireMonth((byte)1);
		gift.setExpireDay((byte)10);
		gift.setAmount(346.35);
		gift.setExpireDate("17042020");
		
		
		return gift;
	}
	
}
