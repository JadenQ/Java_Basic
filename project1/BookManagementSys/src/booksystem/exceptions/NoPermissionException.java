package booksystem.exceptions;

public class NoPermissionException extends RuntimeException{

	private static final long serialVersionUID = -3861476723206774873L;
	public NoPermissionException() {
		super();
		System.err.println("û�н�����һ������Ȩ��");
	}
	
	public NoPermissionException(String message) {
		super(message);
	}
}
