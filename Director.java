public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setGPS(true);
        builder.setTripComputer(true);
        builder.setEngine(Engine.Hybrid);
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setGPS(false);
        builder.setTripComputer(true);
        builder.setEngine(Engine.Electric);
    }
}
