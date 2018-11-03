package org.choco.service;

import java.util.List;

import org.choco.bean.Address;
import org.choco.bean.BoxResult;
import org.choco.bean.QueryResult;
import org.choco.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class AddressService {
	
	@Autowired
	private AddressMapper mapper;
	
	public QueryResult selectAll(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List list =  mapper.selectAll();
		QueryResult result = new QueryResult();
		result.setList(list);
		result.setCount(((Page)list).getTotal());
		result.setPageNo(((Page)list).getPageNum());
		result.setPageSize(((Page)list).getPageSize());
		return result;
	}

	public  QueryResult getAddressByKeyword(String keyword, int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		String[] kws = keyword.trim().split("\\s+");
		System.out.println(kws.length);
		String kw0, kw1, kw2;
		if (kws.length >= 3) {
			kw0 = kws[0];
			kw1 = kws[1];
			kw2 = kws[2];
		} else if (kws.length == 2) {
			kw0 = kws[0];
			kw1 = kws[1];
			kw2 = null;
		} else if (kws.length == 1) {
			kw0 = kws[0];
			kw1 = null;
			kw2 = null;
		} else {
			kw0 = null;
			kw1 = null;
			kw2 = null;
		}
		List list = mapper.getAddressByKeyword(kw0, kw1, kw2);
		QueryResult result = new QueryResult();
		result.setList(list);
		result.setCount(((Page)list).getTotal());
		result.setPageNo(((Page)list).getPageNum());
		result.setPageSize(((Page)list).getPageSize());
		return result;
	}

	public BoxResult getNearbyBox(String address, double longitude, double latitude) {
		BoxResult result = new BoxResult();
		result.setAddress(address);
		result.setLatitude(latitude);
		result.setLongitude(longitude);
		
		List boxes = mapper.getNearbyBox(longitude, latitude);
		result.setBoxes(boxes);
		return result;
	}

}
