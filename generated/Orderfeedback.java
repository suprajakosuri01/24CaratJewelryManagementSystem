
public class Orderfeedback {
private String productFeedback;

public void setProductFeedback(String value) {
   this.productFeedback = value;
}

public String getProductFeedback() {
   return this.productFeedback;
}

private String deliveryAgentFeedback;

public void setDeliveryAgentFeedback(String value) {
   this.deliveryAgentFeedback = value;
}

public String getDeliveryAgentFeedback() {
   return this.deliveryAgentFeedback;
}

private String productRatingId;

public void setProductRatingId(String value) {
   this.productRatingId = value;
}

public String getProductRatingId() {
   return this.productRatingId;
}

private String/*No type specified!*/ var4;

public void setVar4(String/*No type specified!*/ value) {
   this.var4 = value;
}

public String/*No type specified!*/ getVar4() {
   return this.var4;
}

private String/*No type specified!*/ var5;

public void setVar5(String/*No type specified!*/ value) {
   this.var5 = value;
}

public String/*No type specified!*/ getVar5() {
   return this.var5;
}

private String/*No type specified!*/ var6;

public void setVar6(String/*No type specified!*/ value) {
   this.var6 = value;
}

public String/*No type specified!*/ getVar6() {
   return this.var6;
}

/**
 * <pre>
 *           1..*     1..1
 * Orderfeedback ------------------------- Ratings
 *           orderfeedback        &gt;       ratings
 * </pre>
 */
private Ratings ratings;

public void setRatings(Ratings value) {
   this.ratings = value;
}

public Ratings getRatings() {
   return this.ratings;
}

public void setProductFeedback() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDeliveryAgentFeedback() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setProductRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void setDeliveryAgentRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductFeedback() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getDeliveryAgentFeedback() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getProductRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void getDeliveryAgentRatingId() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
