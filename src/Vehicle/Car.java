package Vehicle;

public class Car extends Vehicle{
	public Car (int id, String type) {
		this.name = "Car";
		this.id = id;
		this.type = type;
		this.moveMethod = "drive";
		this.noofDoors = 4;
	}

}
