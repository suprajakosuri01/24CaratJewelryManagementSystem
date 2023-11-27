
public class customer extends Person {
private String customerId;

public void setCustomerId(String value) {
   this.customerId = value;
}

public String getCustomerId() {
   return this.customerId;
}

private String emailId;

public void setEmailId(String value) {
   this.emailId = value;
}

public String getEmailId() {
   return this.emailId;
}

private Integer contactNo;

public void setContactNo(Integer value) {
   this.contactNo = value;
}

public Integer getContactNo() {
   return this.contactNo;
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
 * customer ------------------------- UserDetails
 *           customer        &gt;       userDetails
 * </pre>
 */
private UserDetails userDetails;

public void setUserDetails(UserDetails value) {
   this.userDetails = value;
}

public UserDetails getUserDetails() {
   return this.userDetails;
}

public void setUserId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCustomerId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setEmailId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setContactNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCustomerId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getEmailId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getContactNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
