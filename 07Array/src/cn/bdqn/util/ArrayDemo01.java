package cn.bdqn.util;

public class ArrayDemo01 {

	public static void main(String[] args) {
		/**
		 * ����������ֵ �� ��Сֵ
		 */

		// ����һ������ ������ѡ��
		int[] nums = { 50, 20, 100, 30, 400, 800 };
		// Ĭ�ϵ�һ��Ԫ������̨ ����
		int max = nums[0];
		// ѭ���Ƚ� ����
		for (int i = 0; i < nums.length; i++) {
			// ������� Ԫ�ر� ���ǵ�maxֵ���Ǿ������Ԫ�س�Ϊmax
			if (nums[i] > max) {
				max = nums[i];
				System.out.println("�����������" + max);
			}
		}
		System.out.println("�������˹������==��" + max);

	}

}
