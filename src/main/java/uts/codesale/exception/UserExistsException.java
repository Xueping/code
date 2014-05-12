package uts.codesale.exception;

/**
 * Created by IntelliJ IDEA. User: fraispy Date: 2007-4-16 Time: 16:11:48
 */
public class UserExistsException extends Exception {
	private static final long serialVersionUID = 4050482305178810162L;

	/**
	 * Constructor for UserExistsException.
	 * 
	 * @param message
	 *            exception message
	 */
	public UserExistsException(String message) {
		super(message);
	}
}
