package Vehicle;

public class MotorCycle extends Vehicle{
	public MotorCycle (int id, String type) {
		this.name = "Motorcycle";
		this.id = id;
		this.type = type;
		this.moveMethod = "ride";
		this.noofDoors = 0;
	}
}
