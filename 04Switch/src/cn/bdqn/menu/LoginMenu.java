package cn.bdqn.menu;

import java.util.Scanner;

/**
 * ��¼С����
 */
public class LoginMenu {

	public static void main(String[] args) {
		System.out.println("============һ���˵�============");
		System.out.println("1:��¼ϵͳ");
		System.out.println("2:�˳�ϵͳ");
		System.out.println("����������ѡ��:::::");
		/**
		 *  ��ȡ�û�������
		 *  01.�û���������  ������������
		 *  02.���������   �˳�ϵͳ
		 */
		Scanner input = new Scanner(System.in);
		// ����û��������һ������ ����� if�ṹ��
		if (input.hasNextInt()) {
			int choose = input.nextInt();
			// �����û���ͬ��ѡ����벻ͬ��case��
			switch (choose) {
			case 1: // ��¼ϵͳ
				System.out.println("============�����˵�============");
				System.out.println("1:�ͻ���Ϣ����");
				System.out.println("2:�������");
				System.out.println("3:�������");
				System.out.println("4:ע��");
				System.out.println("����������ѡ��:::::");
				int answer = input.nextInt();
				switch (answer) {
				case 1:
					System.out.println("�������ϵͳ====���ͻ���Ϣ����");
					System.out.println("1:��ʾ���пͻ���Ϣ");
					System.out.println("2:������пͻ���Ϣ");
					System.out.println("3:�޸����пͻ���Ϣ");
					System.out.println("4:��ѯ�ͻ���Ϣ");
					break;
				case 2:
					System.out.println("2:�������");
					break;
				case 3:
					System.out.println("�������ϵͳ====���������");
					System.out.println("1:���˴����");
					System.out.println("2:���˳齱");
					System.out.println("3:�����ʺ�");
					break;
				case 4:
					System.out.println("4:ע��");
					break;
				default:
					break;
				}
				break;
			case 2: // �˳�ϵͳ
				System.out.println("��ӭ�´ι��٣�");
				break;
			default:
				System.out.println("��֪��ʲô���");
				break;
			}
		} else {
			System.out.println("����������ȷ�����֣� �����Ѿ�������");
		}

	}

}
