package cn.bdqn.menu;

import java.util.Scanner;

public class ScannerHas {

	/**
	 *      next()ϵ�У�ֻ�ܻ�ȡ�û������ֵ��
	 *  hasNext����ϵ�У�
	 *    01.��ȡ�û�����ֵ��
	 *    02.�ж�ֵ�����ͣ�
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������һ�����֣�");
		boolean result = input.hasNextInt();
		if (result) { // ��ͬ�� result==true
			System.out.println("��������ȷ��");
		} else {
			System.out.println("����ȷ");
		}

	}

}
