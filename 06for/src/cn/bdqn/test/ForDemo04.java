package cn.bdqn.test;

import java.util.Scanner;

public class ForDemo04 {

	public static void main(String[] args) {
		/**
		 *  ����
		 *    01.���û�ѭ������5��ѧԱ������
		 *    02.����������25��İٷֱ�
		 *    03.������λ��Ч����
		 */
		Scanner input = new Scanner(System.in);
		int num = 0; // ��¼�������25�������
		for (int i = 1; i <= 5; i++) {
			System.out.println("�������" + i + "��ѧԱ�����䣺");
			int age = input.nextInt();
			if (age >= 25) {
				num++;
			}
		}
		System.out.println("25��İٷֱ��ǣ�" + (num / 5.0 * 100) + "%");

	}

}
