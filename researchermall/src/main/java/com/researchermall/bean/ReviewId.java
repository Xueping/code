package com.researchermall.bean;

import java.io.Serializable;


public class ReviewId implements Serializable {

    private static final long serialVersionUID = 1L;

    private int algorid;
    
    private int userid;
    
    public int hashCode() {
      return (algorid + userid);
    }
   
    public boolean equals(Object object) {
      if (object instanceof ReviewId) {
    	  ReviewId otherId = (ReviewId) object;
        return (otherId.algorid == this.algorid) && (otherId.userid == this.userid);
      }
      return false;
    }
    

}
