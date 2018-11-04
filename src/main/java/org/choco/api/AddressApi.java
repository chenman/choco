package org.choco.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.choco.bean.Address;
import org.choco.bean.BoxResult;
import org.choco.bean.QueryResult;
import org.choco.bean.Role;
import org.choco.data.common.JsonResult;
import org.choco.data.common.JsonResultMethod;
import org.choco.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.util.StringUtil;

@RestController
public class AddressApi extends BaseApi {

	private final static Logger log = LoggerFactory.getLogger(AddressApi.class);

	@Autowired
	private AddressService addressService;

	@ResponseBody
	@RequestMapping(value = "/api/getAddressList", produces = "application/json; charset=utf-8", method = {
			RequestMethod.GET, RequestMethod.POST })
	public JsonResult getAddressList(HttpServletRequest request, HttpSession session) {

		String keyword = request.getParameter("address");
		String pageNo = request.getParameter("pageNo");
		pageNo = StringUtil.isEmpty(pageNo) ? "0" : pageNo;
		String pageSize = request.getParameter("pageSize");
		pageSize = StringUtil.isEmpty(pageSize) ? "10" : pageSize;

		QueryResult result = addressService.getAddressByKeyword(keyword, Integer.parseInt(pageNo),
				Integer.parseInt(pageSize));
		log.info(JSON.toJSONString(result));
		return JsonResultMethod.code_200("The request completed successfully.", result);
	}
	

	@ResponseBody
	@RequestMapping(value = "/api/getBoxList", produces = "application/json; charset=utf-8", method = {
			RequestMethod.GET, RequestMethod.POST })
	public JsonResult getBoxList(HttpServletRequest request, HttpSession session) {

		String pageNo = request.getParameter("pageNo");
		pageNo = StringUtil.isEmpty(pageNo) ? "0" : pageNo;
		String pageSize = request.getParameter("pageSize");
		pageSize = StringUtil.isEmpty(pageSize) ? "10" : pageSize;

		String zoneName = request.getParameter("zoneName");
		String boxName = request.getParameter("boxName");
		QueryResult result = addressService.getBoxList(zoneName, boxName, Integer.parseInt(pageNo),
				Integer.parseInt(pageSize));
		log.info(JSON.toJSONString(result));
		return JsonResultMethod.code_200("The request completed successfully.", result);
	}

	@ResponseBody
	@RequestMapping(value = "/api/getNearbyBox", produces = "application/json; charset=utf-8", method = {
			RequestMethod.GET, RequestMethod.POST })
	public JsonResult getNearbyBox(HttpServletRequest request, HttpSession session) {

		String address = request.getParameter("address");
		String longitude = request.getParameter("longitude");
		String latitude = request.getParameter("latitude");
		
		longitude = StringUtil.isEmpty(longitude) ? "0" : longitude;
		latitude = StringUtil.isEmpty(latitude) ? "0" : latitude;

		BoxResult result = addressService.getNearbyBox(address, Double.parseDouble(longitude), Double.parseDouble(latitude));
		log.info(JSON.toJSONString(result));
		return JsonResultMethod.code_200("The request completed successfully.", result);
	}
}
