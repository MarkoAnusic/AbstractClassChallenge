public abstract class ProductForSale {

   protected String type;
   protected Double price;
   protected String description;

   protected ProductForSale(final String type, final Double price, final String description) {
      this.type = type;
      this.price = price;
      this.description = description;
   }

   protected double getSalesPrice(int quantity)
   {
      return price*quantity;
   }

   protected void printPricedItem(int quantity)
   {
      System.out.printf("""
              Simple description about the item:
              Item: %s
              Quantity: %d
              Item Price: %.2f""", type,price,getSalesPrice(quantity));
   }

   protected abstract void showDetails();

}
