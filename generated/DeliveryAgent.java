
public class DeliveryAgent extends Person {
private String agentId;

public void setAgentId(String value) {
   this.agentId = value;
}

public String getAgentId() {
   return this.agentId;
}

private Integer contactNo;

public void setContactNo(Integer value) {
   this.contactNo = value;
}

public Integer getContactNo() {
   return this.contactNo;
}

private Integer ssn;

public void setSsn(Integer value) {
   this.ssn = value;
}

public Integer getSsn() {
   return this.ssn;
}

private Integer drivingLicenseNo;

public void setDrivingLicenseNo(Integer value) {
   this.drivingLicenseNo = value;
}

public Integer getDrivingLicenseNo() {
   return this.drivingLicenseNo;
}

private String/*No type specified!*/ var5;

public void setVar5(String/*No type specified!*/ value) {
   this.var5 = value;
}

public String/*No type specified!*/ getVar5() {
   return this.var5;
}

/**
 * <pre>
 *           1..1     1..1
 * DeliveryAgent ------------------------- UserDetails
 *           deliveryAgent        &gt;       userDetails
 * </pre>
 */
private UserDetails userDetails;

public void setUserDetails(UserDetails value) {
   this.userDetails = value;
}

public UserDetails getUserDetails() {
   return this.userDetails;
}

public void setAgentId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setContactNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setSsn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDrivingLicenseNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getAgentId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getContactNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getSsn() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getDrivingLicenseNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
