import java.util.ArrayList;

public class Store {

   private static ArrayList<ProductForSale> productForSales = new ArrayList<>();
   private static ArrayList<OrderItem> order = new ArrayList<>();

   public static void main(String[] args) {

   }


   private static void listOfOrderedItems()
   {
      double totalPrice = 0;
      System.out.println("All ordered items and their quantity with price:\n");
      for(OrderItem orderItem: order)
      {
         orderItem.product().printPricedItem(orderItem.quantity());
         totalPrice += orderItem.product().getSalesPrice(orderItem.quantity());
      }

      System.out.println("Total price is " + totalPrice + "$");

   }

   private static void listOfProductsForSale()
   {
      System.out.println("All products for sale:\n------------------------");
      for(ProductForSale product: productForSales)
      {
         System.out.println("-".repeat(20));
         product.showDetails();
      }
   }
}
