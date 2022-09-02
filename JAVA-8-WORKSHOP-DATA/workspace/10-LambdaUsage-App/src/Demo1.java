import java.util.function.UnaryOperator;

public class Demo1 {

	public static void main(String[] args) {
		int input = 2;

		// input = 5; // CE

		UnaryOperator<Integer> operator = (i) -> i * input;

		// input = 4; //CE

		System.out.println(operator.apply(3));
	}
}
