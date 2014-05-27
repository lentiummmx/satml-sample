/**
 * 
 */
package mx.com.nunez.xoco.satml.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class ConvertSATMLtoJSON {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String xmlPath = 
//				"/xml/sample-xml.xml";
				"/satml/ref_main.xml";
		
		InputStream is = 
//				ConvertSATMLtoJSON.class.getResourceAsStream("/xml/sample-xml.xml");
				ConvertSATMLtoJSON.class.getResourceAsStream(xmlPath);
        String xml = IOUtils.toString(is);
        
        XMLSerializer xmlSerializer = new XMLSerializer(); 
        JSON json = xmlSerializer.read( xml );  
        System.out.println( json.toString(2) );
        
        
        String SoapMessageString = xml;
        JSONObject soapDataInJsonObject = XML.toJSONObject(SoapMessageString);
        System.out.println(soapDataInJsonObject.toString(2));
	}

}
