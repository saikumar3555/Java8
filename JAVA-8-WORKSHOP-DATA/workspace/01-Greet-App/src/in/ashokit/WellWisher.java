package in.ashokit;

public class WellWisher {

	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		Greeting hindiGreeting = new HindiGreeting();
		wish(hindiGreeting); // calling wish method with hindiGreeting obj

		Greeting englishGreeting = new EnglishGreeting();
		wish(englishGreeting); // calling wish method with englishGreeting obj
	}

}
