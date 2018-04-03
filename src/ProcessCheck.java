
public class ProcessCheck {
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());
		th.start();
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
