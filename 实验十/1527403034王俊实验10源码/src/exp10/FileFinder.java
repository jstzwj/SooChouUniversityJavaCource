package exp10;

import java.io.File;
import java.util.LinkedList;


public class FileFinder {
	public static LinkedList<File> findFile(File path){
		LinkedList<File> result=new LinkedList<File>();
		if(path.isDirectory()==false){
			if(path.getName().equals("javahello.txt")){
				result.add(path);
				return result;
			}else{
				return result;
			}
		}else{
			File[] lst=path.listFiles();
			for(File each:lst){
				LinkedList<File> subLst=findFile(each);
				for(File eachPath:subLst){
					result.add(eachPath);
				}
			}
			return result;
		}
	}
	public static void main(String[]args){
		String basePos="test/";
		File baseDir=new File(basePos);
		LinkedList<File> result=findFile(baseDir);
		for(File each:result){
			System.out.println(each.getAbsolutePath());
			System.out.println(each.length());
			System.out.println(each.canRead());
			System.out.println(each.canWrite());
			
			
		}
		
		
	}
}
