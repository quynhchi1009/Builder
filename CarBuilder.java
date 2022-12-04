public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }
    
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int SeatNumbers) {
        this.car.setSeats(SeatNumbers);
    }

    @Override
    public void setEngine(Engine Engine) {
        this.car.setEngine(Engine);
    }

    @Override
    public void setTripComputer(boolean ins) {
        this.car.setInstruction(ins);
    }

    @Override
    public void setGPS(boolean gps) {
        this.car.setGPS(gps);
    }

    public Car getResult() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
