package org.choco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.choco.bean.Address;

@Mapper
public interface AddressMapper {
	
    List<Address> selectAll();

    List<Address> getAddressByKeyword(String kw0, String kw1, String kw2);

	List getNearbyBox(double longitude, double latitude);

	List getBoxList(String zoneName, String boxName);
}
