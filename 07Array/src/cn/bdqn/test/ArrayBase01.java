package cn.bdqn.test;

import java.util.Scanner;

public class ArrayBase01 {

	public static void main(String args[]) {
		/**
		 * ����
		 * �봴��һ���ܱ���5��ѧԱ�ɼ������飡
		 * 
		 * ������
		 * 01.ѧԱ�ɼ�����double����
		 * 02.5ѧԱ��һ������
		 * 
		 * ��ͬ�������͵�һ�����ݵļ���=======������
		 */

		// double[] scores = new double[5]; �����������ͬʱ�����ڴ��п�����5�������Ŀռ䣡
		// System.out.println(scores[5]); �����±�Խ��

		String[] scores;// ��������
		scores = new String[5]; // ���ٿռ�

		/**
		scores[0] = "С��1";
		scores[1] = "С��2";
		scores[2] = "С��3";
		scores[3] = "С��4";
		scores[4] = "С��5";
		 *  ʹ��ѭ����5��ѧ����������ֵ
		 *  
		 *  scores.length:��ȡ����ĳ���
		 *  
		 *  ������±����ֵ=����ĳ���-1
		 */
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("���������±���" + i + "������");
			scores[i] = input.next();
		}

		// ����==���Ѽ����е�ÿ��Ԫ�ش�ӡ����

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// ��������ķ�ʽ
		int nums[] = { 1, 2, 3, 6, 5, 4 };
		System.out.println(nums[5]);

		double[] scores2 = new double[] { 120, 150, 98 };

	}
}
