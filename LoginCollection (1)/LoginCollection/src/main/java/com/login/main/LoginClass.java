package com.login.main;

import java.util.HashSet;
import java.util.Set;

import com.login.exception.InvaildException;
import com.login.model.Login;
import com.login.service.LoginServiceImpl;
import com.login.service.LoginServiceIntf;
/**
 * 
 * @author avvari.anudeep
 *
 */
public class LoginClass {

	public static void main(String[] args) {

		Login login1 = new Login( 51968, "Anudeep", "Anudeep");
		Login login2 = new Login( 51968303, "RamSai", "krishna");
		Set<Login> loginObj = new HashSet<Login>();
		loginObj.add(login1);
		loginObj.add(login2);
		LoginServiceIntf loginServiceIntf = new LoginServiceImpl();

		try {
			Login logins = loginServiceIntf.validateUser(loginObj);
			System.out.println("Welcome " + logins.getUserName());
		} catch (InvaildException e) {
			e.printStackTrace();
		}

	}

}
