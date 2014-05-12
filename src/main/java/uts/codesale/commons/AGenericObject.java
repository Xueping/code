package uts.codesale.commons;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * Created by IntelliJ IDEA. User: fraispy Date: 2007-4-2 Time: 13:54:10
 */
public abstract class AGenericObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long CreateBy;
	private long UpdateBy;
	private Date UpdateDate;

	public abstract String toString();

	public abstract boolean equals(Object o);

	public abstract int hashCode();

	@Column(nullable = false)
	public long getCreateBy() {
		return CreateBy;
	}

	public void setCreateBy(long createBy) {
		CreateBy = createBy;
	}

	@Column(nullable = false,insertable=false)
	public Timestamp getCreateDate() {
		
		java.util.Date date= new java.util.Date();
		return new Timestamp(date.getTime());
	}


	@Column()
	public long getUpdateBy() {
		return UpdateBy;
	}

	public void setUpdateBy(long updateBy) {
		UpdateBy = updateBy;
	}

	@Column()
	public Date getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	
}