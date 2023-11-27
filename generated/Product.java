import java.util.Set;
import java.util.HashSet;

public class Product {
private String productId;

public void setProductId(String value) {
   this.productId = value;
}

public String getProductId() {
   return this.productId;
}

private String productName;

public void setProductName(String value) {
   this.productName = value;
}

public String getProductName() {
   return this.productName;
}

private String productDescripton;

public void setProductDescripton(String value) {
   this.productDescripton = value;
}

public String getProductDescripton() {
   return this.productDescripton;
}

private String/*No type specified!*/ var4;

public void setVar4(String/*No type specified!*/ value) {
   this.var4 = value;
}

public String/*No type specified!*/ getVar4() {
   return this.var4;
}

private String/*No type specified!*/ var5;

public void setVar5(String/*No type specified!*/ value) {
   this.var5 = value;
}

public String/*No type specified!*/ getVar5() {
   return this.var5;
}

/**
 * <pre>
 *           1..*     0..1
 * Product ------------------------- Catalog
 *           product        &lt;       catalog
 * </pre>
 */
private Catalog catalog;

public void setCatalog(Catalog value) {
   this.catalog = value;
}

public Catalog getCatalog() {
   return this.catalog;
}

/**
 * <pre>
 *           1..1     1..*
 * Product ------------------------- ProductCategory
 *           product        &gt;       productCategory
 * </pre>
 */
private Set<ProductCategory> productCategory;

public Set<ProductCategory> getProductCategory() {
   if (this.productCategory == null) {
this.productCategory = new HashSet<ProductCategory>();
   }
   return this.productCategory;
}

/**
 * <pre>
 *           1..1     1..1
 * Product ------------------------- orderItems
 *           product        &gt;       orderItems
 * </pre>
 */
private orderItems orderItems;

public void setOrderItems(orderItems value) {
   this.orderItems = value;
}

public orderItems getOrderItems() {
   return this.orderItems;
}

public void setProductId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setProductName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setProductDescription() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductDescription() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
