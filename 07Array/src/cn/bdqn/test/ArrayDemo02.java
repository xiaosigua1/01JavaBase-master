package cn.bdqn.test;

import java.util.Scanner;

public class ArrayDemo02 {

	/**
	 * ����
	 * 01.����һ���ܱ���5��ѧ���ɼ�������
	 * 02.ѭ�������鸳ֵ
	 * 03.��ȡ5��ѧ����ƽ����
	 */
	public static void main(String[] args) {
		// ����double���͵�����
		double[] scores = new double[5];
		// ����һ�����������ܷ���
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "��ѧԱ�ĳɼ���");
			scores[i] = input.nextDouble();
			sum += scores[i]; // �����ܳɼ�
		}
		System.out.println("ƽ����Ϊ" + (sum / scores.length));

	}
}
