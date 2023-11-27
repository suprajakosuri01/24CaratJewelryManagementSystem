
public class ProductCategory {
private String categoryId;

public void setCategoryId(String value) {
   this.categoryId = value;
}

public String getCategoryId() {
   return this.categoryId;
}

private String categoryName;

public void setCategoryName(String value) {
   this.categoryName = value;
}

public String getCategoryName() {
   return this.categoryName;
}

/**
 * <pre>
 *           1..*     1..1
 * ProductCategory ------------------------- Product
 *           productCategory        &lt;       product
 * </pre>
 */
private Product product;

public void setProduct(Product value) {
   this.product = value;
}

public Product getProduct() {
   return this.product;
}

public void setCategoryId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCategoryName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCategoryId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getcategoryName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
