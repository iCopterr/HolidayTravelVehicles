public class customer{
  private String customerID;
  private String customerName;
  private String customerAddress;
  private String customerNumber;

  public Customer(String customerID, String customerName, String customerAddress, String customerNumber){
    this.customerID = customerID;
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    this.customerNumber = customerNumber;
  }

  public void requestPurchase(){
    System.out.println(customerName + "request a pruchase.");
  }

  public String getCustomerID() { 
    return customerID; 
  }
  public String getCustomerName() {
    return customerName; 
  }
  public String getCustomerAddress() { 
    return customerAddress; 
  }
  public String getCustomerNumber() {
    return customerNumber; 
  }
  
}
