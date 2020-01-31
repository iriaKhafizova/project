
package apiTestCase;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InitialDataTesting {

	private final static CloseableHttpClient httpClient = HttpClients.createDefault();

	private static JSONObject parsedResponse;

	@Test

	public void apiTest() throws IOException, ParseException {

		System.out.println("============ API TEST RUN STARTED ============");

		String apiEndpoint = "https://marketingapi.wheelsup.com/api/initial-data/";

		System.out.println("API ENDPOINT IS " + apiEndpoint);

		// get response

		String response = getRequest(apiEndpoint);

		System.out.println("Response is " + response);

		// parse response in JSON

		JSONParser parser = new JSONParser();

		parsedResponse = (JSONObject) parser.parse(response);

		// verify social accounts

		String twitter = "https://twitter.com/WheelsUp";

		String instagram = "http://instagram.com/wheelsup8760";

		verifySocialAccounts(twitter, instagram);

		System.out.println("============ API TEST RUN FINISHED ============");

	}

	public static void verifySocialAccounts(String twitter, String instagram) throws ParseException {

		String keysString = parsedResponse.get("keys").toString();

		JSONParser parser = new JSONParser();

		JSONObject parsedResponse = (JSONObject) parser.parse(keysString);

		String actualInstagramLink = parsedResponse.get("instagram").toString();

		System.out.println("Actual Instagram link is " + actualInstagramLink);

		String actualTwitterLink = parsedResponse.get("twitter").toString();

		System.out.println("Actual Twitter link is " + actualTwitterLink);

		Assert.assertEquals(twitter, actualTwitterLink);

		Assert.assertEquals(instagram, actualInstagramLink);

	}

	public static String getRequest(String apiEndpoint) throws ClientProtocolException, IOException {

		HttpGet request = new HttpGet(apiEndpoint);

		String result = null;

		// add request headers

		request.addHeader("Content-Type", "application/json");

		try (CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();

			if (entity != null) {

				// return it as a String

				result = EntityUtils.toString(entity);

			}

		} catch (Exception e) {

			System.out.println("getRequest method is throwing " + e);

		}

		return result;
	}

}
