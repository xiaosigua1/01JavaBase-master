package cn.bdqn.test;

import java.util.Scanner;

public class LoginDemo08 {

	/**
	 * ����
	 * 01.��֤�û����������Ƿ���ȷ
	 * 02.�û�����������Ĵ�����3��
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�����������û�����");
			String userName = input.next();
			System.out.println("�������������룺");
			String password = input.next();
			// ��֤�û����������Ƿ���ȷ
			if (userName.equals("admin") && password.equals("admin")) {
				System.out.println("��ϲ�� ��¼�ɹ���");
				break;
			} else {
				if (i == 2) { // ���һ��
					System.out.println("���Ѿ�������� 3�Σ�����");
					break;
				}
				System.out.println("�������������" + (2 - i) + "�λ���");
			}

		}

	}
}
