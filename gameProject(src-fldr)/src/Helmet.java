/**
 * ---------------------------------------------------------------------------
 * File name: Helmet.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * ---------------------------------------------------------------------------
 */


/**
 * Allows user to create Helmet objects that extend Armor class
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Helmet extends Armor
{
	/**
	 * Creates Helmet object    
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	Helmet()
	{
		super(1, false, false);
		super.setName("Helmet");
	}//end Helmet
}//end Helmet.java
