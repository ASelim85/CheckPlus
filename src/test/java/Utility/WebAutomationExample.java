package Utility;

import java.net.HttpURLConnection;
import java.net.URL;

public class WebAutomationExample {
	public static void main(String[] args) {
		// Set the URL you want to check the response code for
		String url = "https://www.google.com";

		// Create an instance of HttpURLConnection
		HttpURLConnection connection = null;

		try {
			// Create a URL object with the specified URL
			URL urlObj = new URL(url);

			// Open a connection to the URL
			connection = (HttpURLConnection) urlObj.openConnection();

			// Get the HTTP response code
			int responseCode = connection.getResponseCode();

			// Print the response code
			System.out.println("Response Code: " + responseCode);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
}