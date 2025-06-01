package com.testng1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization1 {

	@Test
	@Parameters({ "username", "password" })
	public void aMethod(@Optional("Arul") String name, String pass) {
		System.out.println("Name: " + name + ", Password: " + pass);
	}

	@Test
	@Parameters({ "phone" })
	public void bMethod(String mob) {
		System.out.println("Mobile Number: " + mob);
	}

}
