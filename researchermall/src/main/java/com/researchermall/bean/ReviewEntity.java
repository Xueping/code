package com.researchermall.bean;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "td_algorithm_review"
 *
 * @author Xueping Peng
 * @version v0.1
 *
 */

@Entity
@Table(name="td_algorithm_review"/* , catalog="community"*/ )
@IdClass(ReviewId.class)
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ReviewEntity.countAll", query="SELECT COUNT(x) FROM ReviewEntity x" )
} )
public class ReviewEntity{

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
	@Id
    private Integer    algorid      ;

	@Id
    private Integer    userid       ;

    @Column(name="Comments", length=1000)
    private String     comments     ;

    @Lob
    @Column(name="Picture")
    private byte[]     picture      ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ReviewDate")
    private Date       reviewdate   ;

    @Column(name="Status", nullable=false, length=50)
    private String     status       ;

    @Column(name="CreateBy", nullable=false)
    private Integer    createby     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreateDate", nullable=false, insertable=false)
    private Date       createdate   ;

    @Column(name="UpdateBy")
    private Integer    updateby     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UpdateDate")
    private Date       updatedate   ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
//    @PrimaryKeyJoinColumn(name="userid", referencedColumnName="ID")
    @JoinColumn(name = "userid", updatable = false, insertable = false, referencedColumnName = "id")
    private UserEntity user;
    
    @ManyToOne
//    @PrimaryKeyJoinColumn(name="algorid", referencedColumnName="ID")
    @JoinColumn(name = "algorid", updatable = false, insertable = false, referencedColumnName = "id")
    private AlgorithmEntity algorithm;
    
    
    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ReviewEntity() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : AlgorId ( INT ) 
    public void setAlgorid( Integer algorid ) {
        this.algorid = algorid;
    }
    public Integer getAlgorid() {
        return this.algorid;
    }

    //--- DATABASE MAPPING : UserId ( INT ) 
    public void setUserid( Integer userid ) {
        this.userid = userid;
    }
    public Integer getUserid() {
        return this.userid;
    }

    //--- DATABASE MAPPING : Comments ( VARCHAR ) 
    public void setComments( String comments ) {
        this.comments = comments;
    }
    public String getComments() {
        return this.comments;
    }

    //--- DATABASE MAPPING : Picture ( BLOB ) 
    public void setPicture( byte[] picture ) {
        this.picture = picture;
    }
    public byte[] getPicture() {
        return this.picture;
    }

    //--- DATABASE MAPPING : ReviewDate ( DATETIME ) 
    public void setReviewdate( Date reviewdate ) {
        this.reviewdate = reviewdate;
    }
    public Date getReviewdate() {
        return this.reviewdate;
    }

    //--- DATABASE MAPPING : Status ( CHAR ) 
    public void setStatus( String status ) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    //--- DATABASE MAPPING : CreateBy ( INT ) 
    public void setCreateby( Integer createby ) {
        this.createby = createby;
    }
    public Integer getCreateby() {
        return this.createby;
    }

    //--- DATABASE MAPPING : CreateDate ( TIMESTAMP ) 
    public void setCreatedate( Date createdate ) {
        this.createdate = createdate;
    }
    public Date getCreatedate() {
        return this.createdate;
    }

    //--- DATABASE MAPPING : UpdateBy ( INT ) 
    public void setUpdateby( Integer updateby ) {
        this.updateby = updateby;
    }
    public Integer getUpdateby() {
        return this.updateby;
    }

    //--- DATABASE MAPPING : UpdateDate ( DATETIME ) 
    public void setUpdatedate( Date updatedate ) {
        this.updatedate = updatedate;
    }
    public Date getUpdatedate() {
        return this.updatedate;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public AlgorithmEntity getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(AlgorithmEntity algorithm) {
		this.algorithm = algorithm;
	}

	//----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer();  
        sb.append(algorid);
        sb.append("|");
        sb.append(userid);
        sb.append("|");
        sb.append(comments);
        // attribute 'picture' not usable (type = byte[])
        sb.append("|");
        sb.append(reviewdate);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(createby);
        sb.append("|");
        sb.append(createdate);
        sb.append("|");
        sb.append(updateby);
        sb.append("|");
        sb.append(updatedate);
        return sb.toString(); 
    } 

}
