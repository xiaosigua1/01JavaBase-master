package cn.bdqn.whileAndDo;

import java.util.Scanner;

/**
 *  ��ִ��һ�Σ����жϣ�
 *  
 *  do{
 *    ѭ����
 *  }while(ѭ������);
 * 
 * ������
 *  01.��¼ÿ���û��������Ʒ��  ֮����� ���ˣ�
 *  02.���ӹ�����Ʒ������
 *  03.���������嵥
 */
public class Shopping04 {

	public static void main(String[] args) {
		System.out.println("��ӭ����   *********С����*********    ����");
		Scanner input = new Scanner(System.in);
		String answer = "";
		// ����һ����¼�ܽ��ı���
		double money = 0;
		// ����һ������ ���� �����嵥
		String bill = "";
		do {
			System.out.println("1:ñ�� \t 2:������ \t 3������Ь");
			System.out.println("���������������Ʒ��ţ�");
			int choose = input.nextInt();
			System.out.println("���������������Ʒ��������");
			int count = input.nextInt();
			switch (choose) {
			case 1:
				bill += "��������" + count + "��ñ�ӣ���Ҫ֧�����Ϊ����" + (20 * count) + "\n";
				money += (20 * count);
				break;
			case 2:
				bill += "��������" + count + "�������ģ���Ҫ֧�����Ϊ����" + (30 * count) + "\n";
				money += (30 * count);
				break;
			case 3:
				bill += "��������" + count + "������Ь����Ҫ֧�����Ϊ����" + (50 * count) + "\n";
				money += (50 * count);
				break;
			}
			System.out.println("�Ƿ���������y/n��");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("���������˵����£�" + bill);
		System.out.println("����ʵ�����ѽ��Ϊ��" + money);
		System.out.println("��ӭ�´ι��٣�");

	}
}
