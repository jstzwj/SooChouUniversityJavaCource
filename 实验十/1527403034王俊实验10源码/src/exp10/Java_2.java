package exp10;

import java.io.*;


public class Java_2 {
	public static void main(String []args){
		int []intArray={1,2,3,4,5};
		int j;
		try{
			DataOutputStream out=new DataOutputStream(
					new FileOutputStream("data.dat"));
			for(j=0;j<intArray.length;j++){
				out.writeInt(intArray[j]);
			}
			out.close();
			DataInputStream in=new DataInputStream(
					new FileInputStream("data.dat"));
			
			while(in.available()!=0){
				j=in.readInt();
				System.out.println(j);
			}
			in.close();
		}catch(IOException e){System.out.println("¶ÁÐ´´íÎó");}
	}
}
