package cn.bdqn.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo04 {

	/**
	 * ���� �㷨
	 * ǰ��:���������е����� ������ ����ģ�
	 */
	public static void main(String[] args) {
		// �ȶ���һ��int���͵�����
		int[] nums = new int[6];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 9;
		nums[4] = 10;
		/**
		 *  ������� һ������ ���뵽������ ���ұ�֤ �����˳��
		 *  
		 *  ������
		 *  01.����������������������  ѭ���������е�ÿһ��Ԫ�ؽ��бȽϴ�С
		 *  02.�������������������� С�� ĳ��Ԫ�ص�ʱ��    ������������  ʹ�� С��    ����ʹ�ô��ڣ�
		 *    ��ô���Ԫ�ص��±�  Ӧ�������������������ֵ��±�
		 */
		Scanner input = new Scanner(System.in);
		int index = nums.length - 1; // �洢�������ֵ��±�
		System.out.println("��������һ�����֣�");
		int num = input.nextInt();
		for (int i = 0; i < nums.length; i++) {
			if (num < nums[i]) { // �ҵ��������ֵ��±�
				index = i;
				break; // �ҵ��±� �����˳�
			}
		}
		System.out.println("���������ֵ��±��ǣ�" + index);
		/**
		 * ���� ��
		 * 01.�����￪ʼ���ƣ���
		 *    �����ǲ������ֵ��±�λ�ÿ�ʼ�����ƣ�����
		 *    �ѵ���5�����ƣ���
		 *    Ӧ����10�������ƣ�����  �Ӻ���ǰ���κ���   ���Ҹ�ֵ
		 * 02.�Ѳ�������ַŽ������ָ��λ��
		 */
		for (int i = nums.length - 1; i > index; i--) {
			nums[i] = nums[i - 1];
		}
		nums[index] = num; // ��ֵ
		System.out.println(Arrays.toString(nums)); // ������ת����Stirng
	}
}
