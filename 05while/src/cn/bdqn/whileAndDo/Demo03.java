package cn.bdqn.whileAndDo;

public class Demo03 {

	public static void main(String[] args) {
		/**
		 * ����
		 * ��100���ڵ�ż����
		 * 
		 * ������
		 * 01.����һ����ʼ�����ܺ�  sum
		 * 02.ȷ����������   100���ڵ�����
		 * 03.�ж� �ǲ���ż������ż�����
		 * 
		 */

		int sum = 0;
		int num = 0; // ��ʼ������
		while (num <= 100) {
			if (num % 2 == 0) {// ��ż��
				sum = sum + num;
			}
			num++;
		}
		System.out.println("100���ڵ�ż����==��" + sum);
	}

}
