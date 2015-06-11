
/**
 *
 * @author Cvety
 */
public class Card {
	
	private String strength;
	private String color;
	
	
	
	public Card() {
		
		
	}
	public Card(String strength, String color) {
		this.strength = strength;
		this.color = color;
		
	}
	/**
	 * @return the strength
	 */
	public String getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(String strength) {
		this.strength = strength;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [strength=" + strength + ", color=" + color + "]";
	}
	
	

}
