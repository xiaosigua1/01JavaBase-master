package cn.bdqn.test;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		/**
		 * ����
		 *  ��һ��������ƻ��һ����
		 *  �ڶ���������ճ��һ����
		 *  ������������Ǧ��һ����
		 *  ����û�н�����
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�����������Ŀ������Σ�");
		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("��һ��������ƻ��һ����");
			break;
		case 2:
			System.out.println("�ڶ���������ճ��һ����");
			break;
		case 3:
			System.out.println("������������Ǧ��һ����");
			break;
		default:
			System.out.println("û�н�����");
			break;
		}

		/**
		 * break��
		 *   01.����������ǰ�����壡 ����break�����һ������
		 *   02.break֮������д���룡��Ϊ���Ĵ��벻��õ�ִ�У�
		 * 
		 */

	}

}
