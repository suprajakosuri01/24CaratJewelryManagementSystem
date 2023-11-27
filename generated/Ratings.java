import java.util.Set;
import java.util.HashSet;

public class Ratings {
private String ratingId;

public void setRatingId(String value) {
   this.ratingId = value;
}

public String getRatingId() {
   return this.ratingId;
}

private String rating;

public void setRating(String value) {
   this.rating = value;
}

public String getRating() {
   return this.rating;
}

/**
 * <pre>
 *           1..1     1..*
 * Ratings ------------------------- Orderfeedback
 *           ratings        &lt;       orderfeedback
 * </pre>
 */
private Set<Orderfeedback> orderfeedback;

public Set<Orderfeedback> getOrderfeedback() {
   if (this.orderfeedback == null) {
this.orderfeedback = new HashSet<Orderfeedback>();
   }
   return this.orderfeedback;
}

public void setRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setRating() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getRating() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
