package exp10;
import java.io.*;
public class RandomIntegerWriter {
	public static void main(String []args){
		File txtFile=new File("txtFile.txt");
		File binFile=new File("binFile.txt");
		try {
			FileWriter txtWriter=new FileWriter(txtFile);
			FileOutputStream binWriter=new FileOutputStream(binFile);
			for(int i=0;i<10;++i){
				int num=(int) (Math.random()*100);
				System.out.println(num);
				txtWriter.write(Integer.toString(num));
				binWriter.write(num);
			}
			txtWriter.close();
			binWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
