import java.util.Set;
import java.util.HashSet;

public class Card {
private String cardId;

public void setCardId(String value) {
   this.cardId = value;
}

public String getCardId() {
   return this.cardId;
}

private String cardType;

public void setCardType(String value) {
   this.cardType = value;
}

public String getCardType() {
   return this.cardType;
}

/**
 * <pre>
 *           1..1     1..*
 * Card ------------------------- PaymentsInfo
 *           card        &lt;       paymentsInfo
 * </pre>
 */
private Set<PaymentsInfo> paymentsInfo;

public Set<PaymentsInfo> getPaymentsInfo() {
   if (this.paymentsInfo == null) {
this.paymentsInfo = new HashSet<PaymentsInfo>();
   }
   return this.paymentsInfo;
}

public void setCardId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCardType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCardId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCardType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
