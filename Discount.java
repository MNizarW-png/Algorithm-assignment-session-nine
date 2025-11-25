public class Discount {
  public static void main(String args[]) {
    double TotalPayment = 200000;
    double Money = 500000;
    
    double DiscountPercentA = 10;
    double DiscountPercentB = 20;
    double discount = 0;
    
    if (TotalPayment > 200000) {
        discount = DiscountPercentB;
    }else if (TotalPayment > 50000) {
        discount = DiscountPercentA;
    }else{
        discount = 0;
    }
    double hargasetelahdiscount= TotalPayment - ( TotalPayment * discount / 100);
    System.out.println("Total bayar sebelum diskon : " + TotalPayment);
    System.out.println("Diskon didapat : " + discount + "%");
    System.out.println("Total bayar setelah diskon : " + hargasetelahdiscount);
  }
}