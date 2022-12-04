public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int SeatNumbers) {
        this.manual.setSeats(SeatNumbers);
    }

    @Override
    public void setEngine(Engine Engine) {
        this.manual.setEngine(Engine);
    }

    @Override
    public void setTripComputer(boolean instruction) {
        this.manual.setInstruction(instruction);
    }

    @Override
    public void setGPS(boolean gps) {
        this.manual.setGPS(gps);
    }

    public Manual getResult() {
        Manual x = this.manual;
        this.reset();
        return x;
    }
}
