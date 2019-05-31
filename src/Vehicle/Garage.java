package Vehicle;

import java.util.ArrayList;

public class Garage {
 public ArrayList<Vehicle> vehicleList = new ArrayList<>(); 
 public double bill;
  
 public void addList (Vehicle c) {
	 vehicleList.add(c);
 }
 public void removeList(int id, String type) {
	 if(vehicleList.size()>0) {
		 for(int count = 0; count< vehicleList.size(); count++) {
			 if(vehicleList.get(count).id == id && vehicleList.get(count).type.equals(type)) {
				 vehicleList.remove(count);
			 }
		
		 }
	 }

 }
 public double billCal(Vehicle c) {
	 if(c.type.equals("Car")) {
		 bill = 200000;
	 } else if(c.type.equals("Motorcycle") ) {
		 bill = 100000;
	 } else if(c.type.equals("Airplane")) {
		 bill = 20000000;
	 }
		 return bill;
 } 
 
 public void empty() {
	 vehicleList.removeAll(vehicleList);
 }
}
