
public class Person {
private String firstName;

public void setFirstName(String value) {
   this.firstName = value;
}

public String getFirstName() {
   return this.firstName;
}

private String lastName;

public void setLastName(String value) {
   this.lastName = value;
}

public String getLastName() {
   return this.lastName;
}

private String/*No type specified!*/ var3;

public void setVar3(String/*No type specified!*/ value) {
   this.var3 = value;
}

public String/*No type specified!*/ getVar3() {
   return this.var3;
}

private Date dateOfBirth;

public void setDateOfBirth(Date value) {
   this.dateOfBirth = value;
}

public Date getDateOfBirth() {
   return this.dateOfBirth;
}

/**
 * <pre>
 *           1..*     1..1
 * Person ------------------------- Gender
 *           person        &lt;       gender
 * </pre>
 */
private Gender gender;

public void setGender(Gender value) {
   this.gender = value;
}

public Gender getGender() {
   return this.gender;
}

public void setFirstName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setLastName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDateOfBirth() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getFirstName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getLastName() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getDateOfBirth() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
