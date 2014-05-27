/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import java.util.List;

import org.jsmpp.examples.satml.pojo.ISATMLReference;
import org.jsmpp.examples.satml.pojo.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class URLReference extends SATMLElement {
	
	public static final String URL_REFERENCE_TAG_HIGH = "0D";
	public static final String URL_REFERENCE_TAG_LOW = "8D";
	
	private Long length;
	private String attribute;
	private SATMLElement addressVariableRef;
	private List<ISATMLReference> params;

	/**
	 * 
	 */
	public URLReference() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.jsmpp.examples.satml.pojo.SATMLElement#toByteCode()
	 */
	@Override
	public String toByteCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
