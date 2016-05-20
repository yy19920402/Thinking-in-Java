package yangyi.tij.exercise;
class MyExecpTion extends Exception{
	public MyExecpTion(String message) {
		super(message);
	}
	public MyExecpTion() {
		// TODO Auto-generated constructor stub
	}
	public MyExecpTion(Exception e){
		e.printStackTrace();
	}
}
class HerException extends Exception{
	public HerException() {
		
	}
	public HerException(String message){
		super(message);
	}
	public HerException(Exception e){
		e.printStackTrace();
	}
}



public class ExeceptionTest {
     public static void main(String[] args) {
    	 
    	 try {
			h();
		} catch (MyExecpTion e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
     }
     public static void f()throws MyExecpTion{
    	 throw new MyExecpTion("nihao");
     }
     public static void h() throws Throwable{
//    	 try {
//			f();
//		} catch (MyExecpTion e) {
//			e.printStackTrace();
//			e.fillInStackTrace();
//			
//			throw e;
//		}
    	 try {
			f();
		} catch (Exception e) {
//			throw new HerException(e);
			
			throw new HerException().initCause(e);
//			e.printStackTrace();
		}
     }
}
