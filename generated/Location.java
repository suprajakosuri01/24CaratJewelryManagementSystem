import java.util.Set;
import java.util.HashSet;

public class Location {
private String locationId;

public void setLocationId(String value) {
   this.locationId = value;
}

public String getLocationId() {
   return this.locationId;
}

private String streetName;

public void setStreetName(String value) {
   this.streetName = value;
}

public String getStreetName() {
   return this.streetName;
}

private String houseNo;

public void setHouseNo(String value) {
   this.houseNo = value;
}

public String getHouseNo() {
   return this.houseNo;
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
 *           1..*     1..1
 * Location ------------------------- Zipcode
 *           location        &gt;       zipcode
 * </pre>
 */
private Zipcode zipcode;

public void setZipcode(Zipcode value) {
   this.zipcode = value;
}

public Zipcode getZipcode() {
   return this.zipcode;
}

/**
 * <pre>
 *           1..1     1..*
 * Location ------------------------- Address
 *           location        &lt;       address
 * </pre>
 */
private Set<Address> address;

public Set<Address> getAddress() {
   if (this.address == null) {
this.address = new HashSet<Address>();
   }
   return this.address;
}

public void setLocation() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setStreetName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setHouseNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getLocationId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getStreetName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getHouseNo() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
