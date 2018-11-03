package org.choco.api;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.choco.bean.Role;
import org.choco.data.common.JsonResult;
import org.choco.data.common.JsonResultMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login extends BaseApi {
	private final static Logger log = LoggerFactory.getLogger(Login.class);

    
	@ResponseBody
	@RequestMapping(value = "/api/login", produces = "application/json; charset=utf-8", method = { RequestMethod.GET,
			RequestMethod.POST })
	public JsonResult doLogin(HttpServletRequest request, HttpSession session) {
		
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        log.info(userId + ";" + password);

		JsonResult result = JsonResultMethod.code_200("The request completed successfully.", new Role("vistor"));
		log.info(result.getData().toString());
		log.info(result.toString());
		return result;
	}

}
