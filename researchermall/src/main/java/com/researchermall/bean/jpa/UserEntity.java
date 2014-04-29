/*
 * Created on 24 Apr 2014 ( Time 16:21:19 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.researchermall.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "td_user"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="td_user"/* , catalog="community"*/)
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="UserEntity.countAll", query="SELECT COUNT(x) FROM UserEntity x" )
} )
public class UserEntity implements Serializable {

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
    @Column(name="FirstName", nullable=false, length=50)
    private String     firstname    ;

    @Column(name="LastName", nullable=false, length=50)
    private String     lastname     ;

    @Column(name="Country", nullable=false, length=50)
    private String     country      ;

    @Column(name="Title", length=10)
    private String     title        ;

    @Column(name="Organization", length=512)
    private String     organization ;

    @Column(name="Speciality", length=512)
    private String     speciality   ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LastLogin", nullable=false)
    private Date       lastlogin    ;

    @Column(name="Email", nullable=false, length=200)
    private String     email        ;

    @Column(name="Phone", nullable=false, length=12)
    private String     phone        ;

    @Column(name="UserName", nullable=false, length=50)
    private String     username     ;

    @Column(name="Password", nullable=false, length=50)
    private String     password     ;

    @Column(name="Enabled", nullable=false)
    private Boolean    enabled      ;

    @Column(name="AccountNonExpired", nullable=false)
    private Boolean    accountnonexpired ;

    @Column(name="PasswordNonExpired", nullable=false)
    private Boolean    passwordnonexpired ;

    @Column(name="AccountNonLocked", nullable=false)
    private Boolean    accountnonlocked ;

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

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public UserEntity() {
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
    //--- DATABASE MAPPING : FirstName ( VARCHAR ) 
    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return this.firstname;
    }

    //--- DATABASE MAPPING : LastName ( VARCHAR ) 
    public void setLastname( String lastname ) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return this.lastname;
    }

    //--- DATABASE MAPPING : Country ( VARCHAR ) 
    public void setCountry( String country ) {
        this.country = country;
    }
    public String getCountry() {
        return this.country;
    }

    //--- DATABASE MAPPING : Title ( VARCHAR ) 
    public void setTitle( String title ) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    //--- DATABASE MAPPING : Organization ( VARCHAR ) 
    public void setOrganization( String organization ) {
        this.organization = organization;
    }
    public String getOrganization() {
        return this.organization;
    }

    //--- DATABASE MAPPING : Speciality ( VARCHAR ) 
    public void setSpeciality( String speciality ) {
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return this.speciality;
    }

    //--- DATABASE MAPPING : LastLogin ( DATETIME ) 
    public void setLastlogin( Date lastlogin ) {
        this.lastlogin = lastlogin;
    }
    public Date getLastlogin() {
        return this.lastlogin;
    }

    //--- DATABASE MAPPING : Email ( VARCHAR ) 
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    //--- DATABASE MAPPING : Phone ( VARCHAR ) 
    public void setPhone( String phone ) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    //--- DATABASE MAPPING : UserName ( VARCHAR ) 
    public void setUsername( String username ) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }

    //--- DATABASE MAPPING : Password ( VARCHAR ) 
    public void setPassword( String password ) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    //--- DATABASE MAPPING : Enabled ( BIT ) 
    public void setEnabled( Boolean enabled ) {
        this.enabled = enabled;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    //--- DATABASE MAPPING : AccountNonExpired ( BIT ) 
    public void setAccountnonexpired( Boolean accountnonexpired ) {
        this.accountnonexpired = accountnonexpired;
    }
    public Boolean getAccountnonexpired() {
        return this.accountnonexpired;
    }

    //--- DATABASE MAPPING : PasswordNonExpired ( BIT ) 
    public void setPasswordnonexpired( Boolean passwordnonexpired ) {
        this.passwordnonexpired = passwordnonexpired;
    }
    public Boolean getPasswordnonexpired() {
        return this.passwordnonexpired;
    }

    //--- DATABASE MAPPING : AccountNonLocked ( BIT ) 
    public void setAccountnonlocked( Boolean accountnonlocked ) {
        this.accountnonlocked = accountnonlocked;
    }
    public Boolean getAccountnonlocked() {
        return this.accountnonlocked;
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
        sb.append(firstname);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(country);
        sb.append("|");
        sb.append(title);
        sb.append("|");
        sb.append(organization);
        sb.append("|");
        sb.append(speciality);
        sb.append("|");
        sb.append(lastlogin);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(username);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(enabled);
        sb.append("|");
        sb.append(accountnonexpired);
        sb.append("|");
        sb.append(passwordnonexpired);
        sb.append("|");
        sb.append(accountnonlocked);
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
