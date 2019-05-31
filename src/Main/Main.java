package Main;

import Vehicle.Airplane;
import Vehicle.Car;
import Vehicle.Garage;
import Vehicle.MotorCycle;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Car c1 = new Car(1, "Car");
		MotorCycle m1 = new MotorCycle(1, "Motorcycle");
		Car c2 = new Car(2, "Car");
		Airplane a1  = new Airplane (1, "Airplane");
		MotorCycle m2 = new MotorCycle(2, "Motorcycle");
		Airplane a2  = new Airplane (2, "Airplane");
		
		Garage g1 = new Garage();
		g1.addList(c1);
		
		g1.addList(m1);
		g1.addList(c2);
		g1.addList(a1);
		g1.addList(m2);
		g1.addList(a2);
		g1.removeList(1, "Car");
		
		System.out.println(g1.vehicleList.get(0).type);
		
		g1.empty();
		System.out.println(g1.vehicleList);
	
	}

}
