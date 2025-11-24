import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = headerString(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += eachRentalString(each);
      }
      result += footerString(aCustomer);
      return result;
   }

   private String headerString(String name) {
      return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
   }

   private String eachRentalString(Rental aRental) {
      return aRental.getMovie().getTitle() + ": " +
            String.valueOf(aRental.getCharge()) + "<BR>\n";
   }

   private String footerString(Customer aCustomer) {
      return "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
            "On this rental you earned <EM>" +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
   }
}
