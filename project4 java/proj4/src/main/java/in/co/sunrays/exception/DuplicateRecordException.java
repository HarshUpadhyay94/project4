package in.co.sunrays.exception;
/**
 *  DuplicateRecordException thrown when a duplicate record occurred
 *
 * @author Harsh
 *
 */
public class DuplicateRecordException extends Exception {
//Error message
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}
