public class SalePerson {
    private String saleID;
    private String saleName;
    private String saleContactInfo;

    public SalePerson(String id, String name, String contact) {
        this.saleID = id;
        this.saleName = name;
        this.saleContactInfo = contact;
    }

    public void createInvoice() {
        System.out.println("Invoice created by salesperson: " + saleName);
    }
}
