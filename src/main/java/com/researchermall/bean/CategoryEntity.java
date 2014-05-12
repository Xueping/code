/*
 * Created on 24 Apr 2014 ( Time 16:20:43 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.researchermall.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "td_category"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="td_category"/* , catalog="community"*/ )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="CategoryEntity.countAll", query="SELECT COUNT(x) FROM CategoryEntity x" )
} )
public class CategoryEntity implements Serializable {

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
    @Column(name="Name", nullable=false, length=100)
    private String     name         ;

    @Column(name="Description", length=1000)
    private String     desc         ;

    @Column(name="ParentId", nullable=false)
    private Integer    parentid     ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public CategoryEntity() {
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
    //--- DATABASE MAPPING : Name ( VARCHAR ) 
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //--- DATABASE MAPPING : Desc ( VARCHAR ) 
    public void setDesc( String desc ) {
        this.desc = desc;
    }
    public String getDesc() {
        return this.desc;
    }

    //--- DATABASE MAPPING : ParentId ( INT ) 
    public void setParentid( Integer parentid ) {
        this.parentid = parentid;
    }
    public Integer getParentid() {
        return this.parentid;
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
        sb.append(name);
        sb.append("|");
        sb.append(desc);
        sb.append("|");
        sb.append(parentid);
        return sb.toString(); 
    } 

}
