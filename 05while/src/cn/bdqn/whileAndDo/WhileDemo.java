package cn.bdqn.whileAndDo;

import java.util.Scanner;

public class WhileDemo {
	/**
	 *   ÿ���� ��ҵ� ��ҵ��
	 *   ���������
	 *     01.���             ==������
	 *     02.δ���          ==������д��ҵ     ===���ټ��      ==������д��ҵ     ===���ټ�� 
	 * 
	 * ��ôʹ��whileѭ�����������⣿
	 * 
	 * 
	 * �������
	 *  01.���öϵ�
	 *  02.����debug    F5 ��������   F6 ����ִ��
	 *  03. F6 ����ִ��  �۲����
	 *  
	 *  ���˵�Ҳ���һЩdebug����ʱ����ͼ
	 *  
	 *  ������߲˵��е�window ==>show  view �в�ѯ
	 */
	public static void main(String[] args) {
		// ��ȡ�û�������
		Scanner input = new Scanner(System.in);
		System.out.println("���Ƿ��������ҵ��y/n��");
		String answer = input.next();
		while (answer.equalsIgnoreCase("y")) {
			System.out.println("����д��ҵ  ");
			System.out.println("���Ƿ��������ҵ��y/n��");
			answer = input.next();
		}
		System.out.println("��ϲ�ϸ�");
	}
}
