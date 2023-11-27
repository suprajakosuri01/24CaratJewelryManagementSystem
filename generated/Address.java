
public class Address {
private String addressType;

public void setAddressType(String value) {
   this.addressType = value;
}

public String getAddressType() {
   return this.addressType;
}

private String/*No type specified!*/ var2;

public void setVar2(String/*No type specified!*/ value) {
   this.var2 = value;
}

public String/*No type specified!*/ getVar2() {
   return this.var2;
}

private String/*No type specified!*/ var3;

public void setVar3(String/*No type specified!*/ value) {
   this.var3 = value;
}

public String/*No type specified!*/ getVar3() {
   return this.var3;
}

/**
 * <pre>
 *           1..*     1..1
 * Address ------------------------- Location
 *           address        &gt;       location
 * </pre>
 */
private Location location;

public void setLocation(Location value) {
   this.location = value;
}

public Location getLocation() {
   return this.location;
}

/**
 * <pre>
 *           1..*     1..1
 * Address ------------------------- UserDetails
 *           address        &gt;       userDetails
 * </pre>
 */
private UserDetails userDetails;

public void setUserDetails(UserDetails value) {
   this.userDetails = value;
}

public UserDetails getUserDetails() {
   return this.userDetails;
}

public void setAddressType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getAddressType() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
