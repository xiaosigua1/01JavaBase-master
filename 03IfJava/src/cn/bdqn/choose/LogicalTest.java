package cn.bdqn.choose;

import java.util.Scanner;

public class LogicalTest {

	/**
	 * �߼������  
	 * 01. &&   ��·��   ���ҵĹ�ϵ
	 *         ���ʽ1 && ���ʽ2
	 *      001.���  ���ʽ1Ϊfalse����ִ��  ���ʽ2
	 *      002.���ʽ1�����ʽ2��Ϊtrue�����巵��true �� ����false��
	 * 
	 * 02. ||   ��·��   ���ߵĹ�ϵ
	 *         ���ʽ1 || ���ʽ2
	 *      001.���  ���ʽ1Ϊtrue����ִ��  ���ʽ2
	 *      002.���ʽ1�����ʽ2��һ�����ʽΪtrue�����巵��true �� 
	 *      003.�������ʽ��Ϊfalse!���巵��false��
	 * 03.  ��     ��           ȡ��
	 */
	public static void main(String[] args) {
		/**
		 * ����
		 * �źƵ�Java�ɼ�����98�֣��������ֳɼ�����80�֣���ʦ�ά������
		 * ����Java�ɼ�����100�֣����ֳɼ�����70�֣���ʦҲ�ά����
		 * 
		 * ���� ��
		 *  01.ʲô�������ܻ�ý�����  �����������������Ի�ȡ����
		 *       001.Java�ɼ�>98    && ���ֳɼ�> 80��
		 *       002.Java�ɼ�==100  && ���ֳɼ�> 70��
		 *  02.��ô����������� �ϲ�����
		 *     001  �� 002 ʲô��ϵ����
		 *     ����===��  ||      
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������java�ɼ�");
		double javaScore = input.nextDouble();
		System.out.println("������music�ɼ�");
		double musicScore = input.nextDouble();
		// ��ʼ�߼��ж�
		if ((javaScore > 98 && musicScore > 80)
				|| (javaScore == 100 && musicScore > 70)) {
			System.out.println("��ϲ��������һ���Σ�");
		} else {
			System.out.println("�ؼҼ���дjava���룡");
		}

	}

}
