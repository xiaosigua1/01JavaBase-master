package cn.bdqn.test;

public class BreakDemo06 {

	public static void main(String[] args) {

		/**
		 * 
		 * ����
		 * 01.ѧ����Ȧ   Ȧ��Ϊ6
		 * 02.����Ȧ      ��Ҫ��������  ֮�� ������
		 * 03.����Ȧ      ����
		 */

		for (int i = 1; i <= 6; i++) {
			System.out.println("��" + i + "Ȧ�Ѿ���ʼ��");
			if (i == 3) {
				System.out.println("����������ֱ�ӽ�����һȦ��");
				continue;
			}
			if (i == 5) { // ���� �˳���
				System.out.println("���� �˳���");
				break;
			}
			System.out.println(i + "Ȧ������");
		}

	}
}
