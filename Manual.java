public class Manual {
    private int seatNumbers;
    private Engine engine;
    public boolean instruction;
    public boolean GPS;
    
    public void setSeats(int no) {
        this.seatNumbers = no;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setInstruction(boolean ins) {
        this.instruction = ins;
    }

    public void setGPS(boolean gps) {
        this.GPS = gps;
    }
}
