package cn.bdqn.test;

import java.util.Scanner;

public class ArrayDemo03 {

	/**
	 * 
	 * ����
	 *   ��һ������{10,5,6,80,100}
	 *   01.ѭ����������е�ÿһ��Ԫ��
	 *   02.������������Ԫ�صĺ�
	 *   03.������Ϸ�����û�����һ�����֣�Ȼ�����ѭ���Ƚ�
	 */
	public static void main(String[] args) {
		// ����һ������ ������������
		int nums[] = { 10, 5, 6, 80, 100 };
		// ����һ��������������
		int sum = 0;
		System.out.println("*****��������******");
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println(nums[i]);
		}
		System.out.println("�ܺ�Ϊ��" + sum);

		System.out.println("��������һ�����֣�");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		boolean flag = false; // Ĭ��û���ҵ�
		// ѭ���Ƚ� �������е�ÿһ��Ԫ�ؽ��бȶ�
		for (int i = 0; i < nums.length; i++) {
			if (choose == nums[i]) {
				flag = true;
				break; // �ҵ�֮��ֱ���˳�ѭ��
			}
		}
		if (flag) {
			System.out.println("��ϲ���н���");
		} else {
			System.out.println("���ź�......");
		}

	}

}
