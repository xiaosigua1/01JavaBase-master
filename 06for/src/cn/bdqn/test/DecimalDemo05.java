package cn.bdqn.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalDemo05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������һ�����֣�");
		double num = input.nextDouble(); // 2.333333
		// ����û���������� ������λ��Ч����
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(num);
		System.out.println("������λ��Ч���֣�" + result);

		// ��Stringת���� ��ֵ����
		num = Double.parseDouble(result);

		System.out.println(num + 5);

	}
}
