package cn.bdqn.test;

import java.util.Scanner;

public class PlaySwitch3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("������������������");
		String haha = input.next();
		switch (haha) {
		default:
			System.out.println("û�н�����");
		case "":
			System.out.println("��һ��������ƻ��һ����");
			break;
		case "����":
			System.out.println("�ڶ���������ճ��һ����");
			break;
		case "����":
			System.out.println("������������Ǧ��һ����");
			break;

		}

	}
}
