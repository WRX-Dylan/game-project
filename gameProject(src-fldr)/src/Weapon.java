/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Zelasko, zelaskod@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 14, 2020
 * Contributors: Dylan Colburn
 * ---------------------------------------------------------------------------
 */


/**
 * Contains attributes of and methods to manipulate virtual weapons
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class Weapon extends Equipment implements IUsable
{
	private int normalDamage;
	private int iceDamage;
	private int fireDamage;
	WeaponHandedness weaponHand;
	
	/**
	 * Paramterized constructor for weapon        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public Weapon(String name, int dmg, int ice, int fire, WeaponHandedness wp)
	{
		super(name, 75, .6);
		normalDamage = dmg;
		iceDamage = ice;
		fireDamage = fire;
		weaponHand = wp;
	}//end Weapon

	public Weapon() {
		super();
	}

	/**
	 * returns name from Equipment object modified with the proper prefixes
	 * from damage attributes        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public String getName()
	{
		String n = super.getName();
		if(iceDamage > 0 && fireDamage > 0 && (iceDamage + fireDamage) < 7)
			n += " of Wrath";
		if(iceDamage > 0 && fireDamage > 0 && (iceDamage + fireDamage) > 6)
			n += " of Mighty Wrath";
		if(iceDamage > 0 && fireDamage < 1)
			n += " of Ice";
		if(iceDamage < 1 && fireDamage > 0)
			n += " of Fire";
		return n;
	}//end getName
	
	/**
	 * getter for normalDamage      
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int getNormalDamage()
	{
		return normalDamage;
	}//end getNormalDamage
	
	/**
	 * getter for iceDamage         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int getIceDamage()
	{
		return iceDamage;
	}//end GetIceDamage
	
	/**
	 * getter for FireDamage        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int getFireDamage()
	{
		return fireDamage;
	}//end getFireDamage
	
	/**
	 * getter for weaponhandedness of weapon        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public WeaponHandedness getWeaponHandedness()
	{
		return weaponHand;
	}//end
	
	/**
	 * setter for normal damage        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void setNormalDamage(int dmg)
	{
		normalDamage = dmg;
	}//end setNormalDamage
	
	/**
	 * setter for iceDamage
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 * @return
	 */
	public void setIceDamage(int dmg)
	{
		iceDamage = dmg;
	} //end setIceDamage
	
	/**
	 * setter for fire Damage         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void setFireDamage(int dmg)
	{
		fireDamage = dmg;
	}//end setFireDamage
	
	/**
	 * setter for weaponhandedness         
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void setWeaponHandedness(WeaponHandedness wp)
	{
		weaponHand = wp;
	}//end setWeaponHandedness
	
	/**
	 * toString for Weapon object        
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public String toString()
	{
		return ("{name:\"" + getName() + "\", price:"+ getPrice() +
					", durability:\"" + getDurabilityStatus() + 
					", normal:" + normalDamage+ ", ice:" +
					iceDamage + ", fire:" + fireDamage + 
					", weaponHandedness:\"" + weaponHand +
					"\"}");
	}//end toString

	@Override
	public boolean use(Person person) {
		boolean hit = false;
		attack(person);
		if(person.isHitableDestroyed() == true)
		{
			hit = true;
			return hit;
		}
		else
		{
			return hit;
		}
	}

	public int attack(IHitable hitable)
	{
		return hitable.takeDamage(getNormalDamage(),getFireDamage(),getIceDamage());
	}

}//end Weapon.java
