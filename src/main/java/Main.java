import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import soap.ws.client.generated.LoginService;
import soap.ws.client.generated.LoginServiceLogin;
import soap.ws.client.generated.LoginServiceLogin2;
import soap.ws.client.generated.LoginServiceLogin2Response;
import soap.ws.client.generated.LoginServiceLoginResponse;
import soap.ws.client.generated.LoginServiceLogout;
import soap.ws.client.generated.LoginServiceLogoutResponse;
import soap.ws.client.generated.LoginService_Service;
import soap.ws.client.generated.ROClientIDHeader;
import soap.ws.client.generated.TClientType;

/**
 * @author Roller_M0bster
 */
public class Main {
	public static void main(String[] args) {
		LoginService_Service service = new LoginService_Service();
		LoginService loginService = service.getLoginServicePort();
		ROClientIDHeader clientIDHeader = new ROClientIDHeader();

		LoginServiceLoginResponse loginResponse = new LoginServiceLoginResponse();
		LoginServiceLogoutResponse logoutResponse = new LoginServiceLogoutResponse();

		LoginServiceLogin login = new LoginServiceLogin();
		login.setClientType(TClientType.CT_CUSTOM_CLIENT);
		login.setPassword("qtspass");
		login.setClientVersion(0);
		login.setUsername("QTSUSER");
		login.setInterfaceVersion(0);

		LoginServiceLogout logout = new LoginServiceLogout();
		logout.setUsername("QTSUSER");

		System.out.println("Login start");
		try {
			loginResponse = loginService.login(login);
		} catch (ServerSOAPFaultException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Response " + loginResponse.getResult().getSessionId());
		clientIDHeader.setID(loginResponse.getResult().getSessionId());
		System.out.println("Log out started");
		try {
			logoutResponse = loginService.logout(logout);
		} catch (ServerSOAPFaultException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("You logged out");
	}
}

