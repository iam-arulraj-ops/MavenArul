package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {

	@Parameters({ "username", "password" })
	@Test
	public void aMethod(@Optional("Raj") String name, String pass) {

		System.out.println("Username: " + name + "," + "Password: " + pass);
	}

	@Parameters({ "phone" })
	@Test
	public void bMethod(String no) {
		System.out.println("Phone No: " + no);
	}

}
