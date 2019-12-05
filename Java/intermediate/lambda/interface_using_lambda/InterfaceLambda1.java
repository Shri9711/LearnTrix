package lambda.interface_using_lambda;

@FunctionalInterface
interface MyInterface {
	public String sayHello();
}

public class InterfaceLambda1 {
	public static void main(String[] args) {
		MyInterface obj = () -> {
			System.out.println("Hello!");
			return "Ankush";
		};
		
		System.out.println(obj.sayHello());
	}
}
