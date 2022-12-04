public class Main {
    public static void main(String[] args) {
        Director drt = new Director();

        CarBuilder builder = new CarBuilder();
        Car car = builder.getResult();

        CarManualBuilder builder2 = new CarManualBuilder();
        drt.makeSportCar(builder2);

        Manual manual = builder2.getResult();
    }
    
}
