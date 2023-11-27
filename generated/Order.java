import java.util.Set;
import java.util.HashSet;

public class Order {
private String orderId;

public void setOrderId(String value) {
   this.orderId = value;
}

public String getOrderId() {
   return this.orderId;
}

private float orderPrice;

public void setOrderPrice(float value) {
   this.orderPrice = value;
}

public float getOrderPrice() {
   return this.orderPrice;
}

private String instructions;

public void setInstructions(String value) {
   this.instructions = value;
}

public String getInstructions() {
   return this.instructions;
}

private float discountedPrice;

public void setDiscountedPrice(float value) {
   this.discountedPrice = value;
}

public float getDiscountedPrice() {
   return this.discountedPrice;
}

private String sourceLocationId;

public void setSourceLocationId(String value) {
   this.sourceLocationId = value;
}

public String getSourceLocationId() {
   return this.sourceLocationId;
}

private String destinationId;

public void setDestinationId(String value) {
   this.destinationId = value;
}

public String getDestinationId() {
   return this.destinationId;
}

private float tax;

public void setTax(float value) {
   this.tax = value;
}

public float getTax() {
   return this.tax;
}

private float delivery;

public void setDelivery(float value) {
   this.delivery = value;
}

public float getDelivery() {
   return this.delivery;
}

private String/*No type specified!*/ var9;

public void setVar9(String/*No type specified!*/ value) {
   this.var9 = value;
}

public String/*No type specified!*/ getVar9() {
   return this.var9;
}

private String/*No type specified!*/ var10;

public void setVar10(String/*No type specified!*/ value) {
   this.var10 = value;
}

public String/*No type specified!*/ getVar10() {
   return this.var10;
}

private String/*No type specified!*/ var11;

public void setVar11(String/*No type specified!*/ value) {
   this.var11 = value;
}

public String/*No type specified!*/ getVar11() {
   return this.var11;
}

private String/*No type specified!*/ var12;

public void setVar12(String/*No type specified!*/ value) {
   this.var12 = value;
}

public String/*No type specified!*/ getVar12() {
   return this.var12;
}

private String/*No type specified!*/ var13;

public void setVar13(String/*No type specified!*/ value) {
   this.var13 = value;
}

public String/*No type specified!*/ getVar13() {
   return this.var13;
}

/**
 * <pre>
 *           1..*     1..1
 * Order ------------------------- Status
 *           order        &gt;       status
 * </pre>
 */
private Status status;

public void setStatus(Status value) {
   this.status = value;
}

public Status getStatus() {
   return this.status;
}

/**
 * <pre>
 *           1..1     1..1
 * Order ------------------------- Transactions
 *           order        &lt;       transactions
 * </pre>
 */
private Transactions transactions;

public void setTransactions(Transactions value) {
   this.transactions = value;
}

public Transactions getTransactions() {
   return this.transactions;
}

/**
 * <pre>
 *           1..1     0..1
 * Order ------------------------- PaymentsInfo
 *           order        &lt;       paymentsInfo
 * </pre>
 */
private PaymentsInfo paymentsInfo;

public void setPaymentsInfo(PaymentsInfo value) {
   this.paymentsInfo = value;
}

public PaymentsInfo getPaymentsInfo() {
   return this.paymentsInfo;
}

/**
 * <pre>
 *           1..1     1..1
 * Order ------------------------- Discounts
 *           order        &gt;       discounts
 * </pre>
 */
private Discounts discounts;

public void setDiscounts(Discounts value) {
   this.discounts = value;
}

public Discounts getDiscounts() {
   return this.discounts;
}

/**
 * <pre>
 *           1..1     1..*
 * Order ------------------------- Catalog
 *           order        &lt;       catalog
 * </pre>
 */
private Set<Catalog> catalog;

public Set<Catalog> getCatalog() {
   if (this.catalog == null) {
this.catalog = new HashSet<Catalog>();
   }
   return this.catalog;
}

public void setOrderId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setOrderPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setInstructions() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDiscountedPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setSourceLocationId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setTax() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDeliveryFee() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setOderId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getTax() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getDeliveryFee() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
