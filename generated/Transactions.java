
public class Transactions {
private String transactionId;

public void setTransactionId(String value) {
   this.transactionId = value;
}

public String getTransactionId() {
   return this.transactionId;
}

private float totalPrice;

public void setTotalPrice(float value) {
   this.totalPrice = value;
}

public float getTotalPrice() {
   return this.totalPrice;
}

private Date transactionDate;

public void setTransactionDate(Date value) {
   this.transactionDate = value;
}

public Date getTransactionDate() {
   return this.transactionDate;
}

private String transactionStatus;

public void setTransactionStatus(String value) {
   this.transactionStatus = value;
}

public String getTransactionStatus() {
   return this.transactionStatus;
}

private String/*No type specified!*/ var5;

public void setVar5(String/*No type specified!*/ value) {
   this.var5 = value;
}

public String/*No type specified!*/ getVar5() {
   return this.var5;
}

private String/*No type specified!*/ var6;

public void setVar6(String/*No type specified!*/ value) {
   this.var6 = value;
}

public String/*No type specified!*/ getVar6() {
   return this.var6;
}

private String/*No type specified!*/ var7;

public void setVar7(String/*No type specified!*/ value) {
   this.var7 = value;
}

public String/*No type specified!*/ getVar7() {
   return this.var7;
}

/**
 * <pre>
 *           1..*     1..1
 * Transactions ------------------------- Status
 *           transactions        &lt;       status
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
 * Transactions ------------------------- Order
 *           transactions        &gt;       order
 * </pre>
 */
private Order order;

public void setOrder(Order value) {
   this.order = value;
}

public Order getOrder() {
   return this.order;
}

/**
 * <pre>
 *           1..*     1..1
 * Transactions ------------------------- PaymentsInfo
 *           transactions        &gt;       paymentsInfo
 * </pre>
 */
private PaymentsInfo paymentsInfo;

public void setPaymentsInfo(PaymentsInfo value) {
   this.paymentsInfo = value;
}

public PaymentsInfo getPaymentsInfo() {
   return this.paymentsInfo;
}

public void setTotalPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setTransactionDate() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setTransactionStatus() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getTotalPrice() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getTransactionDate() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getTransactionStatus() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
