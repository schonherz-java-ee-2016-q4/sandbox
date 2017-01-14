package hu.schonherz.jee.service.client.api.vo;

import java.io.Serializable;
import java.util.List;

public class UserVO implements Serializable {
	
	private static final long serialVersionUID = -2786282342895729172L;

	private String username;

	private String password;
	
	private byte[] image;
	
	private List<RoleVO> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<RoleVO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleVO> roles) {
		this.roles = roles;
	}

	
}
