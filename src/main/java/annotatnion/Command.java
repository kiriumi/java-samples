package annotatnion;

public class Command implements IfCommand {

	@Override
	public void consumer(String message) {
		System.out.println("CommandImpl.execute呼び出し");

	}

	@Override
	public boolean supplyer() {
		System.out.println("CommandImpl.booleanMethod呼び出し");
		return false;
	}

	@Override
	public void noAnnotation() {
		System.out.println("CommandImpl.voidMethod呼び出し");

	}

}
