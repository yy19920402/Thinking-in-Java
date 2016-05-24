package yangyi.tij.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

import javax.swing.text.StyledEditorKit.BoldAction;

public class FileTest {

	public static void main(String[] args){
		String cd="D:\\workspace\\TIJ\\src\\yangyi\\tij\\io\\";
//		File file=new File(cd+"a\\b");
//		File parentFile;
//		if(!file.exists()){
//			file.mkdirs();
//			System.out.println("直接输出file:"+file);
//			System.out.println("直接输出file.getName："+file.getName());
//			System.out.println("直接输出file.getAbsolutePath:"+file.getAbsolutePath());
//			System.out.println("直接输出file.getParent"+file.getParent());
//			parentFile=file.getParentFile();
//			boolean b=file.delete();
//			System.out.println("成功删除b"+b);
//			System.out.println("直接输出parentFile"+parentFile);
//			boolean a=parentFile.delete();
//			System.out.println("成功删除a"+a);
//		}else{
//			file.delete();
//		}
//
//		File file=new File(cd+"b.text");
//		if(!file.exists()){
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else{
//			file.delete();
//		}
//		File file=new File(cd+"a"+File.separator+"b");
//		if(!file.exists()){
//			file.mkdirs();
//	}else{
//		String[]a=file.list();
//		for (String string : a) {
//			new File(string).delete();
//		}
////		file.delete();
//	}
		File file=new File("D:\\workspace\\TIJ");
		FileTest.forDir(file);
		
	}
	public static void forDir(File file){
		if(!file.exists()){
			System.out.println(file+"并不存在");
		}else{
			File[] files=file.listFiles();
			if(files!=null&&files.length>0){
				for(File file1:files){
					if(file1.isDirectory()){
						forDir(file1);
					}else{
						System.out.println(file1);
					}
				}
			}
			
		}
	}

}
