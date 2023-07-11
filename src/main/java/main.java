import com.commons.model.GasStation;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<GasStation> listFromGasStation = new ArrayList();
        listFromGasStation.add(new GasStation(20, 2.0));
        listFromGasStation.add(new GasStation(15, 1.8));
        listFromGasStation.add(new GasStation(25, 2.1));

        GasStation gs = new GasStation();
        double fuelValue =
                gs.restOfFuelInsideTheTank(50, listFromGasStation);
        System.out.println(
                String.format("The value (money) of the fuel in the tank. " + fuelValue + " €"));
    }
}
