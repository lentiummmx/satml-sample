/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import org.jsmpp.examples.satml.pojo.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class InlineValue extends SATMLElement {
	
	public static final String INLINE_VALUE_TAG_HIGH = "0A";
	public static final String INLINE_VALUE_TAG_LOW = "8A";
	
	private Long length;
	public String attribute;
	public String content;

	/**
	 * 
	 */
	public InlineValue() {
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
