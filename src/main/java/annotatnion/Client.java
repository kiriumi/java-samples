package annotatnion;

public class Client {

	public static void main(String args[]) {

		IfCommand command = IfCommand.create(new Command());

		command.consumer("サンプル");
		command.supplyer();
		command.noAnnotation();

	}

}
