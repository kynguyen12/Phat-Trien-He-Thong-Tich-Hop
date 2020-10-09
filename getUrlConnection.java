package tuan3_ID;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class getUrlConnection {

	public static void main(String[] args) {
		URL u;
		 URLConnection uc;
		 try {
		 u = new URL("https://www.facebook.com/");
		 uc=u.openConnection();
		 } catch (MalformedURLException e) {
		
		 e.printStackTrace();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }

	}

}
