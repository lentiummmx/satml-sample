/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import java.util.List;

import org.jsmpp.examples.satml.pojo.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class VariableReferenceList extends SATMLElement {
	
	public static final String VARIABLE_REFERENCE_LIST_TAG = "09";
	
	private Long length;
	private List<VariableReference> variables;

	/**
	 * 
	 */
	public VariableReferenceList() {
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
