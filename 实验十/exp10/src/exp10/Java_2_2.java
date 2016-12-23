package exp10;

import java.io.*;

public class Java_2_2 {
	public static void main(String []args){
		long filePoint=0;
		String s;
		try {
			RandomAccessFile file=new RandomAccessFile("file1.txt","r");
			long fileLength=file.length();
			while(filePoint<fileLength){
				s=file.readLine();
				System.out.println(s);
				filePoint=file.getFilePointer();
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("�Ҳ����ļ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("��ȡ����");
			e.printStackTrace();
		}
	}
}
