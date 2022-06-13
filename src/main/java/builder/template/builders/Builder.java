package builder.template.builders;

import builder.template.cars.CarType;
import builder.template.components.Engine;
import builder.template.components.GPSNavigator;
import builder.template.components.Transmission;
import builder.template.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
