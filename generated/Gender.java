import java.util.Set;
import java.util.HashSet;

public enum Gender {
male, female, other;

private String/*No type specified!*/ var1;

public void setVar1(String/*No type specified!*/ value) {
   this.var1 = value;
}

public String/*No type specified!*/ getVar1() {
   return this.var1;
}

/**
 * <pre>
 *           1..1     1..*
 * Gender ------------------------- Person
 *           gender        &gt;       person
 * </pre>
 */
private Set<Person> person;

public Set<Person> getPerson() {
   if (this.person == null) {
this.person = new HashSet<Person>();
   }
   return this.person;
}

}
