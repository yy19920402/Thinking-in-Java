package yangyi.tij.io;

public class HexChange {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(4));//二进制转化
		System.out.println(Integer.toOctalString(15));//八进制转化
		System.out.println(Integer.toHexString(15));//十六进制转化

		int a=16;
		System.out.println("二进制表示的a:"+Integer.toBinaryString(a));
		int b=35;
		System.out.println("二进制表示的b:"+Integer.toBinaryString(b));
		System.out.println("a&b:"+Integer.toBinaryString(a&b));
		System.out.println("a|b:"+Integer.toBinaryString(a|b));
		int c=1200;
		byte[] d=intToByte(c);
		byteToInt(d);
//		long d=12334;
//		intToLong(d);
	}
	public static byte[] intToByte(int content){
		byte[] bytes=new byte[4];
		for(int i=0;i<bytes.length;i++){
			bytes[i]=(byte) (content>>(i*8)&(0xff));
			System.out.println("bytes["+i+"]="+bytes[i]);
		}
		return bytes;
	}
	public static int byteToInt(byte[] bytes){

		int value=0;
		
		for(int i=0;i<bytes.length;i++){
//			value=value+(bytes[i]<<i*8&(0xff));
			value=value+((bytes[i]&0xff)<<i*8);
		}
		System.out.println(value);
		return value;
	}

	public static byte[] intToLong(long content){
		byte[] bytes=new byte[8];
		for(int i=0;i<bytes.length;i++){
			bytes[i]=(byte) (content>>(i*8)&(0xff));
			System.out.println("bytes["+i+"]="+bytes[i]);
		}
		
		return bytes;
	}
	public static byte[] intToString(String content){
		byte[] bytes=content.getBytes();		
		return bytes;
	}
}
