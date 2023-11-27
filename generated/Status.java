import java.util.Set;
import java.util.HashSet;

public class Status {
private String statusId;

public void setStatusId(String value) {
   this.statusId = value;
}

public String getStatusId() {
   return this.statusId;
}

private String statusType;

public void setStatusType(String value) {
   this.statusType = value;
}

public String getStatusType() {
   return this.statusType;
}

/**
 * <pre>
 *           1..1     1..*
 * Status ------------------------- Transactions
 *           status        &gt;       transactions
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
 *           1..1     1..*
 * Status ------------------------- Order
 *           status        &lt;       order
 * </pre>
 */
private Set<Order> order;

public Set<Order> getOrder() {
   if (this.order == null) {
this.order = new HashSet<Order>();
   }
   return this.order;
}

public void setStatusId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setStatusType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getStatusId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getStatusType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
