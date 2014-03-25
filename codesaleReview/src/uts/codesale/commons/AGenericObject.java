package uts.codesale.commons;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA. User: fraispy Date: 2007-4-2 Time: 13:54:10
 */
public abstract class AGenericObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract String toString();

	public abstract boolean equals(Object o);

	public abstract int hashCode();
}