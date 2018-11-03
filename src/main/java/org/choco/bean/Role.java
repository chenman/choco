package org.choco.bean;

import java.io.Serializable;


public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleName;
		
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

}
