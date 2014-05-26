package mx.com.nunez.xoco.satml.sample;

import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		InputStream is = 
//				App.class.getResourceAsStream("/xml/sample-xml.xml");
				App.class.getResourceAsStream("/satml/ref_main.xml");
		String xml = IOUtils.toString(is);

		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(xml);
		System.out.println(json.toString(2));
	}
}
