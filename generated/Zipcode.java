import java.util.Set;
import java.util.HashSet;

public class Zipcode {
private Integer zip;

public void setZip(Integer value) {
   this.zip = value;
}

public Integer getZip() {
   return this.zip;
}

private String city;

public void setCity(String value) {
   this.city = value;
}

public String getCity() {
   return this.city;
}

private String state;

public void setState(String value) {
   this.state = value;
}

public String getState() {
   return this.state;
}

private String country;

public void setCountry(String value) {
   this.country = value;
}

public String getCountry() {
   return this.country;
}

/**
 * <pre>
 *           1..1     1..*
 * Zipcode ------------------------- Location
 *           zipcode        &lt;       location
 * </pre>
 */
private Set<Location> location;

public Set<Location> getLocation() {
   if (this.location == null) {
this.location = new HashSet<Location>();
   }
   return this.location;
}

public void setZip() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCity() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setStatus() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setCountry() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getZip() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCity() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getState() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getCountry() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
