
public class orderItems {
private String orderItemsId;

public void setOrderItemsId(String value) {
   this.orderItemsId = value;
}

public String getOrderItemsId() {
   return this.orderItemsId;
}

private Integer productQuantity;

public void setProductQuantity(Integer value) {
   this.productQuantity = value;
}

public Integer getProductQuantity() {
   return this.productQuantity;
}

private String/*No type specified!*/ var3;

public void setVar3(String/*No type specified!*/ value) {
   this.var3 = value;
}

public String/*No type specified!*/ getVar3() {
   return this.var3;
}

private String/*No type specified!*/ var4;

public void setVar4(String/*No type specified!*/ value) {
   this.var4 = value;
}

public String/*No type specified!*/ getVar4() {
   return this.var4;
}

/**
 * <pre>
 *           1..1     1..1
 * orderItems ------------------------- Product
 *           orderItems        &lt;       product
 * </pre>
 */
private Product product;

public void setProduct(Product value) {
   this.product = value;
}

public Product getProduct() {
   return this.product;
}

public void setOrderItemsId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setProductQuantity() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getOrderItemsId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductQuantity() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
