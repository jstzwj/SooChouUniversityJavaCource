package exp10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
	public static void main(String[] args){
		int count=0;
		char pattern='A';
		char []readBuff;
		readBuff=new char[1024];
		if(args.length<1){
			System.out.println("�����������");
			return;
		}
		try{
			File inFile=new File(args[0]);
			
			FileReader in = new FileReader(inFile);
			while(in.read(readBuff)>0){
				for(char c:readBuff){
					if(c==pattern){
						count++;
					}
				}
			}
			in.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("�Ҳ����ļ�");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("��ȡ����");
			e.printStackTrace();
			return;
		}catch(Exception e){
			System.out.println("δ֪����");
			e.printStackTrace();
			return;
		}
		System.out.println("�ַ�\'"+pattern+"\'�ĸ���Ϊ��"+count);
	}
}
