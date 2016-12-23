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
			System.out.println("输入参数不足");
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
			System.out.println("找不到文件");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("读取出错");
			e.printStackTrace();
			return;
		}catch(Exception e){
			System.out.println("未知错误");
			e.printStackTrace();
			return;
		}
		System.out.println("字符\'"+pattern+"\'的个数为："+count);
	}
}
