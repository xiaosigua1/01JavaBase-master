package cn.bdqn.test;

import java.util.Scanner;

public class ForDemo01 {

	public static void main(String[] args) {
		/**
		 * ����
		 * ѭ������5��ͬѧ�Ŀ��Գɼ���
		 */
		Scanner input = new Scanner(System.in);
		// ����һ��String���͵ı��� ����ÿ��ѧ���ĳɼ�
		String result = "";
		for (int num = 1; num <= 5; num++) {
			System.out.println("�������" + num + "��ͬѧ�ĳɼ���");
			double score = input.nextDouble();
			result += "��" + num + "��ͬѧ�ĳɼ���" + score + "\n";
		}
		System.out.println("********************ѧ���ɼ��б�********************");
		System.out.println(result);

	}

}
