package homework_0131;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�ȶ�ȡh����Java�µ�input.Java�ļ�����ͬ��Ŀ¼�е�1.31�д���һ��Java�ļ�,���д��
		Copy c=new Copy();
		String d=c.read();
		c.write(d);
	}
	//��ȡ�ļ�
	public String read() throws IOException{
		File file=new File("H:/Java/input.java");
		FileInputStream reader=new FileInputStream(file);
		byte[] bt=new byte[(int)file.length()];
		reader.read(bt);
		String str=new String(bt);
		reader.close();
		return str;
	}
	//д�ļ�
	public void write(String str) throws IOException{
		//�������ļ�
		File file=new File("H:/Java/1.31/input.java");
		file.createNewFile();
		Writer writer=new FileWriter(file);
		writer.write(str);
		writer.close();
		System.out.println("�ƶ����");
	}
}
	