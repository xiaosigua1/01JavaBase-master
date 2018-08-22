package cn.bdqn.util;

import java.util.Arrays;

public class ArraysDemo02 {

	/**
	 * Arrays�ǲ�������Ĺ����࣡
	 * int: ������ÿһ��Ԫ�ص���������
	 * num��ֻ��һ��������������ÿһ����Ҫ�����Ԫ��
	 * nums:��Ҫ�����ļ���
	 * for(int  num:nums){
	 * }
	 */
	public static void main(String[] args) {
		int[] nums = { 50, 20, 100, 30, 400, 800 };
		System.out.println("����֮ǰ");
		for (int num : nums) {
			System.out.println(num);
		}
		// 01.ʵ�����������
		Arrays.sort(nums);
		// ʹ��for��ǿ ʵ�ֱ���
		System.out.println("����֮��");
		for (int num : nums) {
			System.out.println(num);
		}
		// 02.������ת����һ���ַ���
		String result = Arrays.toString(nums);
		System.out.println(result);
		// 03.�������е�����Ԫ�ض��ı��һ��ֵ
		Arrays.fill(nums, 521);
		System.out.println("�������е�Ԫ���Ƿ񱻸ı�");
		for (int num : nums) {
			System.out.println(num);
		}
		System.out.println("������");
		// 04.�����鸴�Ƴ�һ��������
		nums = Arrays.copyOf(nums, 10);
		for (int num : nums) {
			System.out.println(num);
		}
		// 05.��ѯĳ��Ԫ�� �� �����е�λ�� ǰ�� ���� ������
		int[] nums2 = { 50, 20, 100, 30, 400, 800 };
		Arrays.sort(nums2);
		int index = Arrays.binarySearch(nums2, 400);
		System.out.println("400���ֵ�λ���ǣ�" + index);

		// ��һ��Stirng���͵��ַ���ת���� char���͵�����
		String a = "50,20,100,30,400,800";
		char[] words = a.toCharArray();
		for (char c : words) {
			System.out.print(c);
		}
	}
}
