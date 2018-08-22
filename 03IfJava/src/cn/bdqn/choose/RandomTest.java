package cn.bdqn.choose;

import java.util.Random;

public class RandomTest {

	/**
	
	 * ����
	 *     �õ�һ��������֣�   ��ϵͳ�������0 - 10 ���ǲ����� 10
	 *     
	 * �����   Random 
	 * nextDouble()     
	 *        
	 * ������      Math
	 * Math.random()   ��ϵͳ�������  0.0--1.0 ���ǲ����� 1.0
	 *  
	 */
	public static void main(String[] args) {

		// ʵ������һ�� ����� ����
		Random r = new Random();
		double num = r.nextDouble(); // 0.0 - 1.0 ���ǲ����� 1.0
		System.out.println("Random������������ǣ�" + num);

		num = Math.random();
		System.out.println("Math������������ǣ�" + num);
		System.out.println("�õ�һ��������֣�   ��ϵͳ�������0 - 10 ���ǲ����� 10");

		int result = (int) (Math.random() * 10);
		System.out.println(result);

	}

}
