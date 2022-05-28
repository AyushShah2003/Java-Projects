package Unit_03;

public class P4_FileHandling_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Read Char by char
		int c;
		while ((c = br.read()) != -1) {
			System.out.println((char) c);
		}
		
		
		//Read byte by byte [Load as binary]
		byte[] bytes = Files.readAllBytes(Paths.get(path));
		
		for (int i = 0; i < bytes.length ; i++) {
//			System.out.println(bytes[i]);
			System.out.println((char)bytes[i]);
		}
