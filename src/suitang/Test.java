package suitang;

import java.io.*;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("H:/Java/input.java");
		//System.out.println(file.createNewFile());
		//System.out.println(file.getPath());
		//System.out.println(file.length());
//		InputStream input=new FileInputStream(file);
//		byte[] b=new byte[(int)file.length()];
//		input.read(b);
//		String str=new String(b);
//		System.out.println(str);
		Reader reader=new FileReader(file);
		char[] c=new char[(int)file.length()];
		reader.read(c);
		System.out.println(new String(c));
	}

}
