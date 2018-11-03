package org.choco;

import java.util.List;

import org.choco.bean.Address;
import org.choco.bean.BoxResult;
import org.choco.bean.QueryResult;
import org.choco.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTest {
	
	@Autowired
	private AddressService addressService;
	
	@Test
	public void getNearbyBox() {

		BoxResult result = addressService.getNearbyBox("aa", 119.08937483653861, 25.39531639611969);
		System.out.println("helloword");
		System.out.println(JSON.toJSON(result));
	}

//	@Test
//	public void selectAll() {
//        QueryResult result = addressService.selectAll(0, 3);
//        
//		System.out.println("=============" + result.getPageSize());
//		System.out.println("=============" + JSON.toJSON(result));
////        for (Address addr : addrs) {
////            System.out.println(JSON.toJSON(addr));
////        }
//	}
}
