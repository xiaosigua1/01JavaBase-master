package cn.bdqn.test;

import java.util.Scanner;

/**
 * 
 *  ���ֻ����������͵� Ĭ��ֵ
 * 
 * ʧȥһ������,���û�����;��
 *  
 * @author С�а趹��
 * 2017-7-27����8:35:59
 */
public class DefaultTest {
	/**
	 * 01.���ǲ��ܰѱ���������main������
	 * 02.�������ڵı����Ǿֲ������������г�ʼֵ��
	 * 03.���Ƕ����� ���У��������⣩
	 * 04.��Ϊmain()static���εģ����Է�������ֻ�ܵ������� static���εı������߷���
	 * 05.ȫ�ֱ�����Ĭ��ֵ
	 */

	static byte byteName;
	static short shortName;
	static int intName;
	static long longName;
	static float floatName;
	static double doubleName;
	static char charName = '\u0000';
	static boolean booleanName;
	static String StringName; // ���������������͵�Ĭ��ֵ����null
	static Scanner input;

	public static void main(String[] args) {
		System.out.println("===============����===============");
		System.out.println("byte���͵�Ĭ��ֵ�ǣ�" + byteName);
		System.out.println("short���͵�Ĭ��ֵ�ǣ�" + shortName);
		System.out.println("int���͵�Ĭ��ֵ�ǣ�" + intName);
		System.out.println("long���͵�Ĭ��ֵ�ǣ�" + longName);

		System.out.println("===============������===============");
		System.out.println("float���͵�Ĭ��ֵ�ǣ�" + floatName);
		System.out.println("double���͵�Ĭ��ֵ�ǣ�" + doubleName);

		System.out.println("===============�ַ�===============");
		System.out.println("char���͵�Ĭ��ֵ�ǣ�" + charName);

		System.out.println("===============����ֵ===============");
		System.out.println("boolean���͵�Ĭ��ֵ�ǣ�" + booleanName);

		System.out.println("===============�ַ���===============");
		System.out.println("String���͵�Ĭ��ֵ�ǣ�" + StringName);
		System.out.println("scanner���͵�Ĭ��ֵ�ǣ�" + input);
	}

}
