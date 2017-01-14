package hu.schonherz.jee.service.client.api.users.service;

import hu.schonherz.jee.service.client.api.vo.UserVO;

public interface UserService {
	UserVO findByUsername(String username);

}
