package cn.bdqn.choose;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		/**
		 * ����
		 * ����źƵ�Java���Գɼ�����98�֣�
		 * �źƾ��ܻ��һ��MP4��Ϊ����
		 * ���򣬷�дjava���룡
		 * 
		 * ������
		 * 01.�źƵĳɼ������ֿ���
		 * 02.  ����98   С�ڵ���98
		 * 03.��������� ֻ��������յ� ���� ʹ��if �������
		 *     Ҳ����ʹ����Ԫ���ʽ
		 *     String result = (javaScore > 98) ? "���һ��MP4��Ϊ����" : "��дjava����";
		       System.out.println(result);
		        
		        
		    ���ʽ��������boolean���͵�ֵ��
		         01.������ʽΪtrueʱ��ִ��if�����еĴ���飡
		         02.����ִ��if����֮��Ĵ���飡
		       
		        if(���ʽ){
		                     �����
		        }
		        
		    ע��㣺���if�ṹ���еĴ����ֻ��һ����䣡��ô����ʡ�ԣ���   �� ���ǲ��Ƽ���
		     
		                ���ʽ��������boolean���͵�ֵ��
		         01.������ʽΪtrueʱ��ִ�д����1��
		         02.����ִ�д����2��
		        if(���ʽ){
		                     �����1
		        }else{
		                      �����2
		        }
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�������źƵĳɼ���");
		// ��ȡ�ɼ�
		double javaScore = input.nextDouble();
		// �ж�
		if (javaScore > 98) {
			System.out.println("���һ��MP4��Ϊ����");
		} else {
			System.out.println("��дjava����");
		}
	}
}
