package yangyi.tij.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFTest {

	public static void main(String[] args) {
		File file=new File("Room");
		if(!file.exists()){
			RandomAccessFile raf;
			file.mkdir();
			File fileText=new File("Room","my.text");
			try {
				fileText.createNewFile();
				raf=new RandomAccessFile(fileText,"rw");
				raf.getFilePointer();
				raf.writeInt(5);
				raf.seek(0);
				byte[] bytes=new byte[(int) raf.length()];
//				int a=raf.readInt();
				System.out.println(raf.read(bytes));
//				System.out.println(a);
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
