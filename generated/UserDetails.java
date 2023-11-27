import java.util.Set;
import java.util.HashSet;

public class UserDetails {
private String userId;

public void setUserId(String value) {
   this.userId = value;
}

public String getUserId() {
   return this.userId;
}

private String username;

public void setUsername(String value) {
   this.username = value;
}

public String getUsername() {
   return this.username;
}

private String password;

public void setPassword(String value) {
   this.password = value;
}

public String getPassword() {
   return this.password;
}

/**
 * <pre>
 *           1..1     1..1
 * UserDetails ------------------------- DeliveryAgent
 *           userDetails        &lt;       deliveryAgent
 * </pre>
 */
private DeliveryAgent deliveryAgent;

public void setDeliveryAgent(DeliveryAgent value) {
   this.deliveryAgent = value;
}

public DeliveryAgent getDeliveryAgent() {
   return this.deliveryAgent;
}

/**
 * <pre>
 *           1..1     1..1
 * UserDetails ------------------------- customer
 *           userDetails        &lt;       customer
 * </pre>
 */
private customer customer;

public void setCustomer(customer value) {
   this.customer = value;
}

public customer getCustomer() {
   return this.customer;
}

/**
 * <pre>
 *           1..1     1..*
 * UserDetails ------------------------- Address
 *           userDetails        &lt;       address
 * </pre>
 */
private Set<Address> address;

public Set<Address> getAddress() {
   if (this.address == null) {
this.address = new HashSet<Address>();
   }
   return this.address;
}

public void setUserId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setUsername() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setPassword() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getUserId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getUsername() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
