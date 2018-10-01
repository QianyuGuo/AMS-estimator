import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDistinct {

	static int i = 0;
	int N = 0;// item number
	int d = 0;// distinct count

	public static void main(String args[]) throws IOException {
		 //for(i=0;i<100;i++) { //repeat the experiment for 100 times.
		long startTime = System.currentTimeMillis(); // get start time
		System.gc();
		long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();// get start memory
		// Distinct ams = new AMS(0x0fffffff,20);
		AMS ams = new AMS(0x0fffffff, 20);
		long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long newMemo = afterUsedMem - beforeUsedMem;
		// System.out.print("new consume"+newMemo);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			int y = Integer.parseInt(line);
			ams.add(y);
		}
		br.close();
		System.out.format("%6.0f%n", ams.distinct());
		// System.out.println("method cosume"+sum);
		long endTime = System.currentTimeMillis(); // get end time

		// System.out.println("time£º "+(endTime-startTime)+"ms");
	}

	// }

}
