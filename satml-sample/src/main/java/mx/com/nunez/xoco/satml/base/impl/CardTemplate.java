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
public class CardTemplate extends SATMLElement {
	
	public static final String CARD_TEMPLATE_TAG = "07";
	
	private Long length;
	private List<SATBytecodeCommand> commands;

	/**
	 * 
	 */
	public CardTemplate() {
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
