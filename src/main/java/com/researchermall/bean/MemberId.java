package com.researchermall.bean;

import java.io.Serializable;


public class MemberId implements Serializable {

    private static final long serialVersionUID = 1L;

    private int communityid;
    
    private int userid;
    
    public int hashCode() {
      return (communityid + userid);
    }
   
    public boolean equals(Object object) {
      if (object instanceof MemberId) {
    	  MemberId otherId = (MemberId) object;
        return (otherId.communityid == this.communityid) && (otherId.userid == this.userid);
      }
      return false;
    }
    

}
