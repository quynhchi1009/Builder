public class Car {
    private int seatNumbers;
    private Engine engine;
    public boolean tripComputer;
    public boolean GPS;
    
    public void setSeats(int no) {
        this.seatNumbers = no;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setInstruction(boolean instruction) {
        this.tripComputer = instruction;
    }

    public void setGPS(boolean gps) {
        this.GPS = gps;
    }
}
