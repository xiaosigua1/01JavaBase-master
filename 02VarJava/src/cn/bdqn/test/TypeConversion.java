package cn.bdqn.test;

public class TypeConversion {
	/**
	 * ����ת��
	 * 01.�Զ�����ת��
	 *         =�ұߵ����� С��=��ߵ����ͣ�
	 * 02.ǿ������ת��   ����� ���ݾ��ȵĶ�ʧ
	 *     =�ұߵ����� ����=��ߵ����ͣ�
	 */
	public static void main(String[] args) {

		/**
		 * double num = 80;
		 *  �Զ�����ת��
		 *  80�� int����                   8��ĵ���
		 *  num�� double����           12��ĺ���
		 *  
		 *  int С��  double
		 *  
		 *  
		 *  float num =80.0;
		 *  80.0�� double����          8��ĵ���
		 *  num�� float����              6��ĺ���
		 *  float С��  double
		 *  
		 */
		// float num = (float) 80.0;
		// float num = 80.0f;
		// float num = 80.0F;

		// int num = (int) (5 + 1.5);
		// System.out.println(num); ���ݾ��ȵĶ�ʧ

		int num = 5;
		num += 5.5; // ����ͬ�� num=num+5.0; += Ĭ���ڵײ�ִ����ǿ������ת��
		System.out.println(num);

	}
}
