
public class MainTicketBooking {

	public static void main(String[] args) {
		 // Example usage
        TicketBooking booking1 = new TicketBooking("Music Concert", "Kalyani", 3);
        booking1.makePayment(2500.00); // Cash

        TicketBooking booking2 = new TicketBooking("Drama Show", "Ashritha", 4);
        booking2.makePayment("WAL12345", 3250.00); // Wallet

        TicketBooking booking3 = new TicketBooking("Comedy Night", "Bhagya", 4);
        booking3.makePayment("1234-5678-9876-5432", "678", "Bhagya", 5000.00); // Credit card

	}

}
