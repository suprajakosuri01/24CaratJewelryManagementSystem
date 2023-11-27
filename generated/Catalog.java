import java.util.Set;
import java.util.HashSet;

public class Catalog {
private float price;

public void setPrice(float value) {
   this.price = value;
}

public float getPrice() {
   return this.price;
}

private String/*No type specified!*/ var2;

public void setVar2(String/*No type specified!*/ value) {
   this.var2 = value;
}

public String/*No type specified!*/ getVar2() {
   return this.var2;
}

/**
 * <pre>
 *           0..1     1..*
 * Catalog ------------------------- Product
 *           catalog        &gt;       product
 * </pre>
 */
private Set<Product> product;

public Set<Product> getProduct() {
   if (this.product == null) {
this.product = new HashSet<Product>();
   }
   return this.product;
}

/**
 * <pre>
 *           1..*     1..1
 * Catalog ------------------------- Order
 *           catalog        &gt;       order
 * </pre>
 */
private Order order;

public void setOrder(Order value) {
   this.order = value;
}

public Order getOrder() {
   return this.order;
}

public void setPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
