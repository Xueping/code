/*
 * Created on 1 May 2014 ( Time 10:13:51 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.researchermall.domain.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "td_user_role"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="td_user_role", catalog="community" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="TdUserRoleEntity.countAll", query="SELECT COUNT(x) FROM TdUserRoleEntity x" )
} )
public class TdUserRoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="RoleId", nullable=false)
    private Integer    roleid       ;

    @Column(name="UserId", nullable=false)
    private Integer    userid       ;

    @Column(name="CreateBy", nullable=false)
    private Integer    createby     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreateDate", nullable=false)
    private Date       createdate   ;

    @Column(name="UpdateBy")
    private Integer    updateby     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UpdateDate")
    private Date       updatedate   ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public TdUserRoleEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : RoleId ( INT ) 
    public void setRoleid( Integer roleid ) {
        this.roleid = roleid;
    }
    public Integer getRoleid() {
        return this.roleid;
    }

    //--- DATABASE MAPPING : UserId ( INT ) 
    public void setUserid( Integer userid ) {
        this.userid = userid;
    }
    public Integer getUserid() {
        return this.userid;
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

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(roleid);
        sb.append("|");
        sb.append(userid);
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
