
public class TicketBooking {
	// Private attributes
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    // Default constructor
    public TicketBooking() {
    }

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Method overloading for payment

    // 1. Cash payment
    public void makePayment(double amount) {
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Payment Mode: Cash");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Transaction completed successfully!");
    }

    // 2. Wallet payment
    public void makePayment(String walletNumber, double amount) {
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Payment Mode: Wallet");
        System.out.println("Wallet Number: " + walletNumber);
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Transaction completed successfully!");
    }

 // 3. Credit card payment
    public void makePayment(String creditCard, String ccv, String name, double amount) {
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Card Number: " + creditCard);
        System.out.println("CCV: " + ccv);
        System.out.println("Card Holder Name: " + name);
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Transaction completed successfully!");
    }



}
