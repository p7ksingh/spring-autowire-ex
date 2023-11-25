package com.infy.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCentre {

	@Autowired
	LaptopService laptopService;
	@Autowired
	MobileService mobileService;

	public void serviceInfo() {

		laptopService.laptopInfo();
		mobileService.mobileInfo();
	}
}
