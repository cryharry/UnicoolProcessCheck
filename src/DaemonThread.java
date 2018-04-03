import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaemonThread implements Runnable {
	@Override
	public void run() {
		while(true) {
			try {
				Process ps = new ProcessBuilder("cmd", "/c", "tasklist | find /i \"미체크학생알림미.exe\"").start();
				BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
				if(br.readLine() == null) {
					Process ps2 = new ProcessBuilder("cmd", "/c", "start C:\\Uni_Cool\\미체크학생알림미.exe").start();
					BufferedReader br2 = new BufferedReader(new InputStreamReader(ps2.getInputStream()));
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
