package yangyi.tij.exercise;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        // ����һ���������飬����Ϊ10
		int[] nums =new int[10];
        
        //ͨ��ѭ�������鸳ֵ
		for (int i = 0; i < nums.length; i++) {
            // ����10���ڵ������
			int x = (int) (Math.random()*10);
            
			nums[i] = x;// ΪԪ�ظ�ֵ
		}
        
		// ʹ��foreachѭ����������е�Ԫ��
		for (int num:nums                    ) {
			System.out.print(num + " ");
		}
	}
}