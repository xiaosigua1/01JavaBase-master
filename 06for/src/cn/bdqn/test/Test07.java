package cn.bdqn.test;

import java.util.Scanner;

public class Test07 {

	/**
	 * ����
	 * 01.ѭ��¼��5��ѧ���Ŀ��Գɼ�
	 * 02.���¼��ķ��� ��  ���� ���� ֹͣ¼��
	 * 03.������붼����ȷ����ô����ƽ����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;// ��¼�ܷ���
		boolean flag = true; // ��¼�Ƿ����ƽ����
		for (int i = 1; i <= 5; i++) {
			System.out.println("�������" + i + "��ͬѧ�ĳɼ���");
			double score = input.nextDouble();
			if (score < 0) {// ֹͣ¼��
				flag = false;
				System.out.println("�������벻�Ϸ���");
				break;
			}
			sum += score;
		}
		if (flag) {
			System.out.println("ƽ����Ϊ��" + (sum / 5));
		} else {
			System.out.println("�������������޷�����");
		}

	}
}
