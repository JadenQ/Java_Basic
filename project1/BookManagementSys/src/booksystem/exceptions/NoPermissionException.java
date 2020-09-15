package booksystem.exceptions;

public class NoPermissionException extends RuntimeException{

	private static final long serialVersionUID = -3861476723206774873L;
	public NoPermissionException() {
		super();
		System.err.println("没有进行这一操作的权限");
	}
	
	public NoPermissionException(String message) {
		super(message);
	}
}
