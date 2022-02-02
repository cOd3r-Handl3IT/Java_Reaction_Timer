import java.util.Scanner;

public class ReactFast {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter at least 1 character and press ENTER to see your speed.");
		Thread.sleep(10000);
		
		System.out.println("Get ready...");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("GO!");
		long startTime = System.currentTimeMillis();
		
		Scanner s = new Scanner(System.in);
		s.next();
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		System.out.println(reactionTime + " milliseconds - that's FAST!");
		
	}

}
