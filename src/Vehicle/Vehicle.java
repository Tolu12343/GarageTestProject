package Vehicle;

public abstract class Vehicle {
	/* always make this abstract */
	public int id;
	public String type;
	public String name;
	public int noofDoors;
	public String moveMethod;
	public String move() {
		return moveMethod;
	}

}
