public class TextStatement extends Statement {
   public String headerString(String name) {
      return "Rental Record for " + name + "\n";
   }

   public String eachRentalString(Rental aRental) {
      return "\t" + aRental.getMovie().getTitle() + "\t" +
            String.valueOf(aRental.getCharge()) + "\n";
   }

   public String footerString(Customer aCustomer) {
      return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n" +
            "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
   }
}
