package cn.bdqn.choose;

import java.util.Scanner;

public class DoubleIf {

	/**
	 * ����
	 * ѧУ�����˶��ᣬ������������10���ڵ�ѧ�����ʸ��������
	 * �����Ա�ֱ�����������Ů����
	 * 
	 *������
	 *01.�ж��Ƿ��ܹ��������
	 *02.��ȷ���������������£��ж��ǽ��������飬���ǽ���Ů����
	 *
	 *
	 *  String������equals�ķ�����
	 *   ������  �ж������ַ����������Ƿ�һ�£�
	 *    һ�·���true��
	 *    ���򷵻�false��
	 *
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		double score = input.nextDouble();
		// 01. ���ж� �ɼ�
		if (score < 10) {
			System.out.println("��ϲ�������������");
			System.out.println("�����������Ա𣡣���/Ů��");
			String sex = input.next();
			// 02. �����Ա� ���벻ͬ�����
			if (sex.equals("��")) {
				System.out.println("������������");
			} else if (sex.equals("Ů")) {
				System.out.println("������Ů����");
			} else {
				System.out.println("û�д��Ա�");
			}
		} else {
			System.out.println("���ź�����Ե������");
		}

	}
}
