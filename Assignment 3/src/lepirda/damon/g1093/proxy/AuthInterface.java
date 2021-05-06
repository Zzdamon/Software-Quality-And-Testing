package lepirda.damon.g1093.proxy;

import lepirda.damon.g1093.factory.User;
import lepirda.damon.g1093.factory.UserType;

public interface AuthInterface {
	public User authRequest(String email, String password,UserType loginType);

}
