package Service;
import model.Product;

public class ProductService {
    public void printProductInfo(Product product) {
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getCategory());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println(product.getDiscount());
        System.out.println(product.getRating());
        System.out.println(product.isActive());
    }
    public void IsInStock(Product product) {
        if (product.getQuantity() > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public void calculateDiscountedPrice(Product product) {
        double discountedPrice = product.getPrice() - (product.getPrice() * product.getDiscount() / 100);
        System.out.println("Discountd Price: " + discountedPrice);
    }
   public void isProsuctPopular(Product product) {
       if (product.getRating() > 4.5) {
           System.out.println("Product is popular");
       } else {
           System.out.println("Product is not popular");
       }
   }
   public void isAvailableForSale(Product product) {
       if (product.isActive()) {
           System.out.println("Product is available for sale");
       } else {
           System.out.println("Product is not available for sale");
       }
   }
    public void getProductCategory(Product product) {
        if (product.getPrice() < 20) {
            System.out.println("cheap");
        } else if (product.getPrice() <= 100) {
            System.out.println("normal");
        } else {
            System.out.println("exspensive");
        }
    }
}
