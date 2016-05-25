package yangyi.tij.io;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.Random;



public class UtilsIO {
	
	public static void main(String[] args) throws IOException {
//		
//		File file=new File("name.text");
//
//		try {
//			FileInputStream in=new FileInputStream(file);
//			FileOutputStream out=new FileOutputStream("helloworld.text");
//			int contentByte=0;
//			while((contentByte=in.read())!=-1){
//				out.write(contentByte);
//			}
//			in.close();
//			out.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		File file=new File("adb.jpg");
//		File file=new File("D:\\workspace\\TIJ\\adb.jpg");
//		try {
////			
//			FileReader reader=new FileReader(file);
////			FileReader reader=new FileReader("D:\\workspace\\TIJ\\adb.jpg");
//			FileWriter writer=new FileWriter("adbcopy.jpg");
//			char[] chars=new char[5000];
//			int b;
//			long timeFirst=System.currentTimeMillis();
////			while((b=reader.read())!=-1){
////				writer.write(b);
////			}
//			do{
//				b=reader.read(chars);
//				writer.write(chars);
//			}while(b==-1);
////			while((b=reader.read(chars))==-1){
////				writer.write(chars);
////				b=reader.read(chars);
////			}
//			reader.close();
//			writer.close();
//			long timeLast=System.currentTimeMillis();
//			System.out.println("¶ÁÐ´ºÄ·ÑÊ±¼ä£º"+(timeLast-timeFirst));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		FileInputStream zijiein=new FileInputStream("D:\\workspace\\TIJ\\adb.jpg");
		BufferedReader reader=new BufferedReader(new InputStreamReader(zijiein));
		FileOutputStream zijieout=new FileOutputStream("namecopy.jpg");
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(zijieout));
//		BufferedReader reader=new BufferedReader(new FileReader("D:\\workspace\\TIJ\\adb.jpg"));
//		BufferedWriter writer=new BufferedWriter(new FileWriter("namecopy.jpg"));
		String content;
		while((content=reader.readLine())!=null){
			writer.write(content);
		}
//		for(int i=0;i<10;i++){
//			String a=Math.random()*100+"";
//			writer.write(a);
//		}
		writer.close();
		reader.close();

	}

}
