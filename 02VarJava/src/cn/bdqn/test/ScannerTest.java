package cn.bdqn.test;

import java.util.Scanner;

/**
 * ֮ǰ �� ����һֱ   �� consolę  ������ݣ�
 * �������� consolę  �������ݣ�
 * 
 * 
 * 
 *   ���ǰ�java.lang������������࣬�����Լ��Ķ�����
 *   ����ʹ���Լ��Ķ���������Ҫ���룡
 *   
 *    java.lang��֮��Ķ�����������ʹ�ã��ͱ��� ���룡
 *    ��ô���룿ʹ�ùؼ��� import��
 *    
 * 
 * 01. ����������Ҫʹ�õ���  import java.util.Scanner;
 * 02. ����Scanner����
 * 03. ʹ�ö����һϵ�з������в���
 * 
 *  
 * 2017-7-25����3:48:33
 */
public class ScannerTest {

	public static void main(String[] args) {
		// ������ ���� ����
		Scanner input = new Scanner(System.in);
		System.out.println("����������������"); // ���
		// ��ȡ�û���consolę�ϵ����� ���Ұ�ֵ����name
		String name = input.next();
		System.out.println("�������������䣺");
		int age = input.nextInt();

		System.out.println("���������ǣ�" + name);
		System.out.println("���������ǣ�" + age);

		// �ж��û��������Ƿ����ת����int����
		System.out.println("��������һ�����֣�");
		boolean flag = input.hasNextInt();
		String result = flag ? "������������֣�" : "������Ĳ������֣�";
		System.out.println(result);
	}
}
