/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import org.jsmpp.examples.satml.pojo.ISATMLReference;
import org.jsmpp.examples.satml.pojo.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class VariableReference extends SATMLElement implements ISATMLReference {
	
	public static final String VARIABLE_REFERENCE_TAG = "08";
	
	private Long length;
	private String variableId;

	/**
	 * 
	 */
	public VariableReference() {
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
