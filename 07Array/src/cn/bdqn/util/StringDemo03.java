package cn.bdqn.util;

import java.util.Arrays;

public class StringDemo03 {
	/**
	 * ����
	 * 01.�ԣ�Ϊ�ָ�㣬��Stringת����һ������
	 * 02.��Stringת����int֮�����
	 */
	public static void main(String[] args) {

		String a = "50,20,100,30,400,800";
		String[] words = a.split(",");
		// ����һ���������� ��
		int sum = 0;
		for (int i = 0; i < words.length; i++) {
			sum += Integer.parseInt(words[i]);
		}
		System.out.println(sum);

		System.out.println("*************�ַ����������***************");
		char[] chars = { 'z', 'f', 'g', 'c', 'a', 'b', 'j' };
		Arrays.sort(chars);
		for (char c : chars) {
			System.out.println(c);
		}

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);
		}

	}
}
