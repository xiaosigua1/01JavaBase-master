package cn.bdqn.choose;

import java.util.Scanner;

public class MulTest {

	/**
	 *
	 *����
	��ѧԱ�Ľ�ҵ���Գɼ�����
	�ɼ�>=80 ������ 
	�ɼ�>=60 ���е�
	�ɼ�<60   ����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������Ŀ��Գɼ���");
		double score = input.nextDouble();
		/**
		 * ʹ��if
		 *  ���⣿��
		 *  ���������ֵ  ��ν�ȥ��  if�ṹ
		if (score >= 80) {
			System.out.println("����");
		}

		if (score >= 60) {
			System.out.println("�е�");
		}

		if (score < 60) {
			System.out.println("��");
		}
		 */

		/**
		 *  ʹ�ö���if
		 *    ע��㣺
		 *  01.ֻҪ���ǵ��������㣬��ִ��һ������飡 ������������������㣬Ҳ��ִ�У�
		 *  02. ����һ����д��ʱ�� ��  ��Χ����������жϣ�
		 *  ���� ��Χ��������  һ�㶼�ǴӴ�С��
		 *  
		 */

		if (score >= 80) {
			System.out.println("�е�");
		} else if (score >= 60) {
			System.out.println("����");
		} else if (score < 60) {
			System.out.println("��");
		}

		System.out.println("�������");

	}

}
