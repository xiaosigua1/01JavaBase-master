package cn.bdqn.test;

public class ArithmeticOperator {

	public static void main(String[] args) {
		double java = 80; // 80.0
		double music = 2; // 2.0
		System.out.println(java + music);
		System.out.println(java - music);
		System.out.println(java * music);
		System.out.println(java / music);
		System.out.println(java % music); // ȡ��

		/**
		 *  һԪ�����  ��  ++   --             һ������������
		 *  ��Ԫ�����  ��  +   -  *  /  %      ��������������
		 *  ��Ԫ�����  ��    ? :                ��������������
		 *  
		 *    ���ʽ1?���ʽ2:���ʽ3
		 *    
		 *    ���ʽ1:�����Ǹ�booleanֵ
		 *    ���ʽ2��������ʽ1��ֵΪtrue��ִ�е�����
		 *    ���ʽ3��������ʽ1��ֵΪfalse��ִ�е�����
		 *  
		 *  alt + �� �ƶ�����
		 */

		int num = 0; // ����
		System.out.println("++num:" + (++num));// �������1��֮������������
		System.out.println("num++:" + (num++)); // �Ȳ���������У�֮�������1
		System.out.println("num:" + num);

		System.out.println("***********��Ԫ�����***************");

		System.out.println("(2 > 5)��" + (2 > 5));

		String result = (20 > 5) ? "��" : "��";
		System.out.println(result);

	}

}
