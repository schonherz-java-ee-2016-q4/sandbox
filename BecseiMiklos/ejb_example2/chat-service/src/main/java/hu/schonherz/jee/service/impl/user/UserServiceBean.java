package hu.schonherz.jee.service.impl.user;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import hu.schonherz.jee.core.dao.UserDao;
import hu.schonherz.jee.service.client.api.users.service.UserServiceLocal;
import hu.schonherz.jee.service.client.api.users.service.UserServiceRemote;
import hu.schonherz.jee.service.client.api.vo.UserVO;

@Stateless(mappedName = "UserService")
@Remote(UserServiceRemote.class)
@Local(UserServiceLocal.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class UserServiceBean implements UserServiceRemote, UserServiceLocal {
	
	@Autowired
	UserDao userDao;

	@Override
	public UserVO findByUsername(String username) {
		User user = userDao.findByUsername(username);
		return null;
	}

}
