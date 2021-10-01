import java.io.*;

public class Headerfst {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter all headers and -1 to end");

		while (true) {
			String line = br.readLine();
			if (line.startsWith("-1"))
				break;

			line = line.substring(line.lastIndexOf("# ") + 1, line.length());
			System.out.println(line);
		}
		System.out.println("LOGGER :: Exit");
	}
}
