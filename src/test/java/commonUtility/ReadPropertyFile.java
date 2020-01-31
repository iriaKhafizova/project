package commonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	private static final String SELENUM_DEMO_RESOURCES_CONFIG_PROPERTIES = "../SelenumDemo/resources/config.properties";

	/**
	 * 
	 * @param props
	 * @return
	 */
	public static String readProperties(String props) {

		Properties pr = new Properties();
		FileInputStream f = null;
		try {
			f = new FileInputStream(SELENUM_DEMO_RESOURCES_CONFIG_PROPERTIES);
		} catch (FileNotFoundException e) {
			System.out.println("Property file is not found :-" + e);
			;
		}
		try {
			pr.load(f);
		} catch (IOException e) {
			System.out.println("Unable to load property file :-" + e);
		}
		String propValue = pr.getProperty(props);
		return propValue;

	}
}
