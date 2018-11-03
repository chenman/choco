package org.choco.api;

import javax.servlet.http.HttpServletRequest;

import org.choco.util.NetworkUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

public class BaseApi {
	private final static Logger log = LoggerFactory.getLogger(BaseApi.class);
	/**
	 * 在本controller所有方法执行前执行本方法.<br>
	 * <p>
	 * <blockquote>
	 * 
	 * <pre>
	 *     1.session timeout refresh.
	 *     2.print commont log.
	 *     3.check login -- unify use header parameter "accessToken".
	 * </pre>
	 * 
	 * </blockquote>
	 * <p>
	 *
	 * @param request
	 *            HttpServletRequest http客户端请求对象
	 * @param uAT
	 *            user access token
	 */
	@ModelAttribute
	public void firstMC(HttpServletRequest request, @RequestHeader(value = "uAT", required = false) String uAT) {
		request.setAttribute("uAT", uAT); // 此处可转换用户的id
		// 打印请求日志
		printAccess(request);
	}

	private final void printAccess(HttpServletRequest request) {
		StringBuilder su = new StringBuilder();
		su.append("\nUser-Access-Args:").append("{");
		su.append("\"protocol\":\"").append(request.getProtocol() + "(" + request.getScheme()).append(")\",");
		su.append("\"ip\":\"").append(NetworkUtils.getIpAddr(request)).append("\",");
		su.append("\"port\":\"").append(NetworkUtils.getPort(request)).append("\",");
		su.append("\"method\":\"").append(request.getMethod()).append("\",");
		su.append("\"url\":\"").append(NetworkUtils.getCurrentURL(request)).append("\",");
		su.append("\"user-agent\":\"").append(NetworkUtils.getUserAgent(request)).append("\",");
		su.append("\"uAT\":\"").append(request.getAttribute("uAT")).append("\"}");
		log.info(su.toString());
	}
}