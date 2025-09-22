public class Vehicle {
    private String vehicleSerialNum;
    private String vehicleName;
    private String vehicleModel;
    private int vehicleYear;
    private String vehicleManufacturer;
    private double vehicleBaseCost;

    public Vehicle(String serialNum, String name, String model, int year, String manufacturer, double baseCost) {
        this.vehicleSerialNum = serialNum;
        this.vehicleName = name;
        this.vehicleModel = model;
        this.vehicleYear = year;
        this.vehicleManufacturer = manufacturer;
        this.vehicleBaseCost = baseCost;
    }

    public void updateInventory() {
        System.out.println("Inventory updated for vehicle: " + vehicleName);
    }

    public void displayInfo() {
        System.out.println(vehicleYear + " " + vehicleManufacturer + " " + vehicleModel + " (" + vehicleName + ")");
        System.out.println("Base Cost: " + vehicleBaseCost);
    }
}
