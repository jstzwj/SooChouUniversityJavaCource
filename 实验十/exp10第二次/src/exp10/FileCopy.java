package exp10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {
	public static void main(String[] args){
		byte []readBuff;
		readBuff=new byte[1024];
		if(args.length<2){
			System.out.println("�����������");
			return;
		}
		try{
			File inFile=new File(args[0]);
			File outFile=new File(args[1]);
			
			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);
			
			//InputStream in=new InputStream(inFile);
			//OutputStream out=new OutputStream(outFile);
			while(in.read(readBuff)>0){
				out.write(readBuff);
			}
			in.close();
			out.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("�Ҳ����ļ�");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("���Ƴ���");
			e.printStackTrace();
			return;
		}catch(Exception e){
			System.out.println("δ֪����");
			e.printStackTrace();
			return;
		}
		System.out.println("�ɹ�����");
	}
}
