package cn.bdqn.shopping;

import java.util.Scanner;

public class ShoppingTest {

	/**
	 * ���л���
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������������ѽ�");
		double money = input.nextDouble();
		System.out.println("�Ƿ�μӻ��������y/n��");
		String answer = input.next();
		if (answer.equalsIgnoreCase("y")) { // ���Դ�Сд�Ƚ�����
			System.out.println("1:��50����2Ԫ�������¿��֣�");
			System.out.println("2:��100����5Ԫ������ۣ�");
			System.out.println("3:��200����10Ԫ����ŷ���ţ�");
			System.out.println("��ѡ������Ҫ��������Ʒ��ţ�");
			// ��ȡ�û�������
			if (input.hasNextInt()) { // ����ȷ������
				int choose = input.nextInt();
				switch (choose) {
				case 1:
					if (money >= 50) {
						System.out.println("���ѽ�" + (money + 2));
						System.out.println("�ɹ��������¿���");
					} else {
						System.out.println("���ѽ��㣡��֧�ֻ�����ʵ�����ѣ�" + money);
					}
					break;
				case 2:
					if (money >= 100) {
						System.out.println("���ѽ�" + (money + 5));
						System.out.println("�ɹ��������");
					} else {
						System.out.println("���ѽ��㣡��֧�ֻ�����ʵ�����ѣ�" + money);
					}
					break;
				case 3:
					if (money >= 200) {
						System.out.println("���ѽ�" + (money + 10));
						System.out.println("�ɹ�����ŷ����");
					} else {
						System.out.println("���ѽ��㣡��֧�ֻ�����ʵ�����ѣ�" + money);
					}
					break;
				default:
					break;
				}
			} else {
				System.out.println("���벻��ȷ�������ܻ�����");
				System.out.println("�������ѽ��Ϊ��" + money);
			}
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("���μӻ������");
			System.out.println("�������ѽ��Ϊ��" + money);
		} else {
			System.out.println("���ǲ����в�����");
		}
	}

}
