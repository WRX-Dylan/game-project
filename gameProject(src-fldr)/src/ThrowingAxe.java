/**
 * ---------------------------------------------------------------------------
 * File name: ThrowingAxe.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Shaffer
 * ---------------------------------------------------------------------------
 */


/**
 * Creates ThrowingAxe objects that extend ranged method
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class ThrowingAxe extends Ranged
{
	/**
	 * Constructor for ThrowingAxe object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public ThrowingAxe()
	{
		super("Throwing Axe", 8, 0, 0, 30, 15 );
		addAmmo(-12);
		setPrice(125);
		setWeaponHandedness(WeaponHandedness.OneHanded);
	}//end ThrowingAxe
}//end ThrowingAxe.java