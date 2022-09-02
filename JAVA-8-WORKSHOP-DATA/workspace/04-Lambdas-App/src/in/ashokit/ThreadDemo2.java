package in.ashokit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Callable<Integer> call = () -> {
			boolean sendEmail = sendEmail();
			if (sendEmail)
				return 0;
			else
				return -1;
		};

		ExecutorService service = Executors.newFixedThreadPool(1);
		service.submit(call);
	}

	public static boolean sendEmail() {
		System.out.println("mail sent......");
		return true;
	}
}