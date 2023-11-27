
public class Discounts {
private String promotionId;

public void setPromotionId(String value) {
   this.promotionId = value;
}

public String getPromotionId() {
   return this.promotionId;
}

private String promotionName;

public void setPromotionName(String value) {
   this.promotionName = value;
}

public String getPromotionName() {
   return this.promotionName;
}

private String promotionCode;

public void setPromotionCode(String value) {
   this.promotionCode = value;
}

public String getPromotionCode() {
   return this.promotionCode;
}

/**
 * <pre>
 *           1..1     1..1
 * Discounts ------------------------- Order
 *           discounts        &lt;       order
 * </pre>
 */
private Order order;

public void setOrder(Order value) {
   this.order = value;
}

public Order getOrder() {
   return this.order;
}

public void setPromotionId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setPromotionName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setPromotionCode() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getPromotionId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getPromotionName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getPromotionCode() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
