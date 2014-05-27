/**
 * 
 */
package mx.com.nunez.xoco.satml.base.impl;

import java.util.List;

import mx.com.nunez.xoco.satml.base.SATMLElement;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public class Card extends SATMLElement {
	
	public static final String CARD_TAG_HIGH = "05";
	public static final String CARD_TAG_LOW = "85";

	public Long length;
	public String attribute;
	public CardId cardId;
	private List<SATBytecodeCommand> commands;
	
	/**
	 * 
	 */
	public Card() {
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
