import java.util.Set;
import java.util.HashSet;

public class PaymentsInfo {
private String paymentId;

public void setPaymentId(String value) {
   this.paymentId = value;
}

public String getPaymentId() {
   return this.paymentId;
}

private Integer cardNo;

public void setCardNo(Integer value) {
   this.cardNo = value;
}

public Integer getCardNo() {
   return this.cardNo;
}

private String expiryDate;

public void setExpiryDate(String value) {
   this.expiryDate = value;
}

public String getExpiryDate() {
   return this.expiryDate;
}

private String cardHolderName;

public void setCardHolderName(String value) {
   this.cardHolderName = value;
}

public String getCardHolderName() {
   return this.cardHolderName;
}

private Integer cvv;

public void setCvv(Integer value) {
   this.cvv = value;
}

public Integer getCvv() {
   return this.cvv;
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
 * PaymentsInfo ------------------------- Card
 *           paymentsInfo        &gt;       card
 * </pre>
 */
private Card card;

public void setCard(Card value) {
   this.card = value;
}

public Card getCard() {
   return this.card;
}

/**
 * <pre>
 *           1..1     1..*
 * PaymentsInfo ------------------------- Transactions
 *           paymentsInfo        &lt;       transactions
 * </pre>
 */
private Set<Transactions> transactions;

public Set<Transactions> getTransactions() {
   if (this.transactions == null) {
this.transactions = new HashSet<Transactions>();
   }
   return this.transactions;
}

/**
 * <pre>
 *           0..1     1..1
 * PaymentsInfo ------------------------- Order
 *           paymentsInfo        &gt;       order
 * </pre>
 */
private Order order;

public void setOrder(Order value) {
   this.order = value;
}

public Order getOrder() {
   return this.order;
}

public void setCardNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setExpiryDate() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCardHolderName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCvv() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCardNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getExpiryDate() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCardHolderName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
