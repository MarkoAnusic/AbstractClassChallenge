public class FoodProduct extends ProductForSale{

   public FoodProduct(String type, Double price, String description) {
      super(type, price, description);
   }

   @Override
   protected void showDetails() {
      System.out.printf("""
              Tastefull %s
              The price is %.2f
              Description: %s""", type,price,description);
   }
}
