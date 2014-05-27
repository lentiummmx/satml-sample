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
public class TextElementTable extends SATMLElement {
	
	public static final String TEXT_ELEMENT_TABLE_TAG = "04";
	
	private Long length;
	private List<TextElement> textElements;

	/**
	 * 
	 */
	public TextElementTable() {
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
