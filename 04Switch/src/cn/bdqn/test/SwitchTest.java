package cn.bdqn.test;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		/**
		 * ����
		 * 
		 *  ��һ��������ƻ��һ����
		 *  �ڶ���������ճ��һ����
		 *  ������������Ǧ��һ����
		 *  ����û�н�����
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�����������Ŀ������Σ�");
		int num = input.nextInt();
		if (num == 1) {
			System.out.println("��һ��������ƻ��һ����");
		} else if (num == 2) {
			System.out.println("�ڶ���������ճ��һ����");
		} else if (num == 3) {
			System.out.println("������������Ǧ��һ����");
		} else {
			System.out.println("û�н�����");
		}

		/**
		 * ����if ��Ȼ�� ��������������⣡
		 * ������ʵ��ʹ���У����ǲ��Ƽ�ʹ�ã�
		 * 
		 * Ϊʲô��
		 * 01.if������  ��Χ������жϣ�
		 * 02.��ֵ�ж�ʹ��switch����
		 * 
		 * ʲô��switchѡ��ṹ
		 * 
		 * ���ʽ:byte,short,int,char,Enum(ö��)  JDK1.7+ String
		 *  switch(���ʽ){
		 *    case  ����1��
		 *          �����1��
		 *           break�� 
		 *    case  ����2��
		 *          �����2��
		 *           break�� 
		 *    case  ����3��
		 *          �����3��
		 *           break�� 
		 *    default��                    �����û���ҵ���Ӧ�ĳ���ֵ��Ĭ��ִ�еĴ���飩
		 *          Ĭ�ϵĴ���飻
		 *           break�� 
		 *  }
		 *  
		 *  �ص㣺
		 *    01. ÿ��case�еĴ���飬������break��β��
		 *      ��Ϊû��break��������ִ�У�֪��������һ��breakΪֹ������switch�ṹ��
		 *    02. default�������Է������κ�λ�ã�������ִ��� ͨ���������Ҳ����ʡ�ԣ�
		 *    
		 *    
		 *    switch�Ͷ���if������
		 *    
		 *    ��ͬ��
		 *  01.��������������֧�����Ľṹ
		 *  02.������������ֵ�ж�
		 *  
		 *    ��ͬ��
		 *  01.switchֻ������ֵ�ж�
		 *  02.����ifҲ������ �����ж�
		 *    
		 */

	}
}
