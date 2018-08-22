package cn.bdqn.test;

public class BubbleSort05 {

	/**
	 * ð������
	 *  �������С��ǰ��
	 *  ����ת����
	 */
	public static void main(String[] args) {
		// ����һ������
		int[] nums = { 10, 5, 7, 20, 50 };

		/**
		 *  ���ѭ�����ƱȽϼ���                   ���鳤��-1
		 *  �ڲ�ѭ������һ�ֱȽ϶��ٴΣ�     ���鳤��-1-i
		 *  ���ѭ��ִ��һ�Σ�  �ڲ�ѭ��ִ��һ�֣�
		 *  
		 *  
		 *  ���˵���ѭ���ı�����i=0
		 *  �ڲ�ѭ���ı�����j=0 ����j<5!
		 *  
		 *  
		 *  ��ô�� i=0��ʱ��   j���0��4 
		 *        i=1��ʱ��   jҲ���0��4    �Դ�����
		 *        ֱ��i������������ʱ��  ˫��ѭ���Ž�����
		 */

		for (int i = 0; i < nums.length - 1; i++) { // ���ѭ�� ��������
			System.out.println("���ѭ��====����" + (i + 1) + "��");
			for (int j = 0; j < nums.length - 1 - i; j++) { // �ڲ�ѭ��
				// �������С��ǰ��
				if (nums[j] > nums[j + 1]) { // ����ת��
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		for (int i : nums) {
			System.out.println(i);
		}
	}

}
