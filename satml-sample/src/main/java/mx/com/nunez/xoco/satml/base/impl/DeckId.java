/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import org.jsmpp.examples.satml.pojo.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class DeckId extends SATMLElement {
	
	public static final String DECK_ID_TAG = "02";
	
	private Long length;
	private String deckId;

	/**
	 * 
	 */
	public DeckId() {
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
