/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import mx.com.nunez.xoco.satml.base.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class CardId extends SATMLElement {
	
	public static final String CARD_ID_TAG = "06";
	
	private Long length;
	private String cardId;

	/**
	 * 
	 */
	public CardId() {
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
