package opreationFactory;

import vehicleInterface.Features;
import vehicleTypes.BMW;
import vehicleTypes.Lexus;
import vehicleTypes.Toyota;

public class VehicleFactory {
	public Features getInstance(String str) {
		if (str.equals("toyota")) {
			return new Toyota();
		} else if (str.equals("bmw")) {
			return new BMW();
		} else
			return new Lexus();

	}

}
