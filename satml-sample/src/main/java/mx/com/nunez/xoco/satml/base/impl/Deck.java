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
public class Deck extends SATMLElement {
	
	public static final String DECK_TAG_HIGH = "01";
	public static final String DECK_TAG_LOW = "81";
	
	private DeckId deckId;
	private TextElementTable textElementTable;
	private CardTemplate cardTemplate;
	private List<Card> cards;

	/**
	 * 
	 */
	public Deck() {
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
