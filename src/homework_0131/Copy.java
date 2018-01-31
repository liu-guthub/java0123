package homework_0131;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//先读取h盘下Java下的input.Java文件再在同级目录中的1.31中创建一个Java文件,最后写入
		Copy c=new Copy();
		String d=c.read();
		c.write(d);
	}
	//读取文件
	public String read() throws IOException{
		File file=new File("H:/Java/input.java");
		FileInputStream reader=new FileInputStream(file);
		byte[] bt=new byte[(int)file.length()];
		reader.read(bt);
		String str=new String(bt);
		reader.close();
		return str;
	}
	//写文件
	public void write(String str) throws IOException{
		//创建新文件
		File file=new File("H:/Java/1.31/input.java");
		file.createNewFile();
		Writer writer=new FileWriter(file);
		writer.write(str);
		writer.close();
		System.out.println("移动完毕");
	}
}
	