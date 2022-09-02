package in.ashokit;

public class Demo3 {

	public void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread....");
		}
	}

	public static void main(String[] args) {
		/*Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};*/
		
		/*Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
			}
		};*/
		Demo3 demo = new Demo3();
		Runnable r  = demo::m1;
		
		Thread t = new Thread(r);
		t.start();
	}

}
