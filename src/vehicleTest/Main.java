package vehicleTest;

import opreationFactory.VehicleFactory;
import vehicleInterface.Features;
import vehicleTypes.Toyota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VehicleFactory vf=new VehicleFactory();
		
		Features f= vf.getInstance("BMW");
		f.wheel();
 
 
 
	}

}
