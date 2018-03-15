package com.mtl.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringCloudEurekaApplicationTests {

	@Test
	public void contextLoads() {
//		int a = 512;
//		System.out.println(Integer.toBinaryString(a));
//		a >>= 3;
//		System.out.println(Integer.toBinaryString(a));

//		int ca = 1;
//		int initca = 63;
//		while(ca < initca){
//			ca <<= 1;
//		}
//		System.out.println(ca);
		HashMap<String,String> a = new HashMap<String,String>();
		a.put("123","456");
	}

}
