public class TradeInVehicle {
    private String vehicleSerialNum;
    private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;

    public TradeInVehicle(String serialNum, String make, String model, int year) {
        this.vehicleSerialNum = serialNum;
        this.vehicleMake = make;
        this.vehicleModel = model;
        this.vehicleYear = year;
    }

    public void evaluateTradeIn() {
        System.out.println("Trade-in vehicle evaluated: " + vehicleMake + " " + vehicleModel);
    }
}
