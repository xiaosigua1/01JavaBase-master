package cn.bdqn.test;

import java.util.Scanner;

import org.junit.Test;

public class DoubleArray08 {

	/**
	 * ��ά���飺ʵ�ʻ���һά���飡
	 * ֻ���������е�ÿһ��Ԫ�أ�����һ��������ѣ�
	 */
	@Test
	public void test01() {
		// ��������ά�����ʱ�� ����ָ����Χ����ĳ���
		int[][] nums = new int[2][2]; // int[][] nums = { {x,x}, {x,x} };
		// ��nums�����еĵ�һ������ĵ�һ��Ԫ�ظ�ֵ
		nums[0][0] = 5;
		nums[0][1] = 51;
		nums[1][0] = 6;
		nums[1][1] = 62;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
		}

	}

	@Test
	public void test02() {
		int[][] nums = { { 1 }, { 2, 5 }, { 7, 9 } };
		/**
		 * ���涨��Ķ�ά����   �м���Ԫ��
		 * 01.�����ά����ĳ���
		 *��ά������ÿһ��Ԫ�صĳ��ȣ���������ô��ȡ�أ�
		 * 02.ѭ����ά���� ֮�� nums[i]����ÿһ��Ԫ�أ����Ծ�.length
		 * �����ȡÿ��ֵ������
		 */
		// System.out.println(nums.length); 2ά����ĳ���
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(nums[i].length); ������Ԫ�صĳ���
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
		}
	}

	/**
	 * ����
	 *   �������༶ ��3��ѧԱ��
	 *  01. ʹ�ö�ά�����ʾ
	 *  02. ѭ����ȡÿ���༶ÿ��ѧԱ�ĳɼ�
	 *  03. �ֱ��ȡÿ���༶��ƽ����
	 */
	@Test
	public void test03() {
		// ��������
		int[][] students = new int[3][3];
		Scanner input = new Scanner(System.in);
		int[] sum = new int[3];// ����ÿ���༶���ܷ���
		for (int i = 0; i < students.length; i++) {
			System.out.println("�������" + (i + 1) + "���༶ѧԱ�ĳɼ���");
			for (int j = 0; j < students[i].length; j++) {
				System.out.println("��" + (j + 1) + "ѧԱ�ĳɼ���");
				students[i][j] = input.nextInt(); // ��ȡÿ��ѧԱ�ĳɼ�
				sum[i] += students[i][j]; // ÿ���༶���ܷ���
			}
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println("��" + (i + 1) + "���༶��ƽ���ɼ��ǣ�" + (sum[i] / 3.0));
		}

	}

}
