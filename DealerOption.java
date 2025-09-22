public class DealerOption {
    private String dealerOptionCode;
    private String dealerDescription;
    private double dealerPrice;

    public DealerOption(String code, String description, double price) {
        this.dealerOptionCode = code;
        this.dealerDescription = description;
        this.dealerPrice = price;
    }

    public double calculateOptionCost() {
        return dealerPrice;
    }

    public String getDescription() {
        return dealerDescription;
    }
}
