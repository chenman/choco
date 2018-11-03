package org.choco;

import java.util.List;

import org.choco.bean.Address;
import org.choco.mapper.AddressMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTest {

	@Autowired
	private AddressMapper addressDao;

	// 查询
	@Test
	public void selectAll() {
//        List<Address> addrs = addressDao.getAddressByKeyword("南溪");
//		List<Address> addrs = addressDao.selectAll();
//		System.out.println("=============" + addrs.size());
//		System.out.println(JSON.toJSONString(addrs.get(0)));
//        for (Address addr : addrs) {
//            System.out.println("id:"+addr.getAddid());
//        }
	}
}
