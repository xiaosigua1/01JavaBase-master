package cn.bdqn.test;

public class ForDemo03 {

	public static void main(String[] args) {
		/**
		 * ����
		 *  100���ڵ�������
		 */
		int sum = 0; // �����ܺ�
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) { // ż��
				sum += i;
			}
		}
		System.out.println("ż��֮�ͣ�" + sum);
	}

}
