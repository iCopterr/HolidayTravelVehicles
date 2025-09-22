import java.util.ArrayList;
import java.util.List;

public class SaleInvoice {
    private String saleInvoiceNumber;
    private String saleDate;
    private int customerID;
    private Vehicle purchasedVehicle;
    private TradeInVehicle tradeInVehicle;
    private List<DealerOption> dealerOptions = new ArrayList<>();
    private double totalPrice;
    private double taxes;
    private double licenseFees;

    public SaleInvoice(String number, String date, int customerID, Vehicle purchasedVehicle) {
        this.saleInvoiceNumber = number;
        this.saleDate = date;
        this.customerID = customerID;
        this.purchasedVehicle = purchasedVehicle;
    }

    public void addDealerOption(DealerOption option) {
        dealerOptions.add(option);
    }

    public void recordTradeIn(TradeInVehicle tradeIn) {
        this.tradeInVehicle = tradeIn;
    }

    public void calculateTotal() {
        totalPrice =  0;
        for (DealerOption option : dealerOptions) {
            totalPrice += option.calculateOptionCost();
        }
        totalPrice += taxes + licenseFees;
    }

    public void printInvoice() {
        System.out.println("Invoice No: " + saleInvoiceNumber);
        System.out.println("Date: " + saleDate);
        purchasedVehicle.displayInfo();
        System.out.println("Total: " + totalPrice);
    }
}
