package cn.bdqn.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderMenu {

	/**
	 * С����  ����ϵͳ
	 */
	public static void main(String[] args) {
		/**
		 * �����ˣ�ѡ���Ʒ���������Ͳ͵�ַ���Ͳ�ʱ�䣬����״̬���ܽ����ޣ����ۣ�
		 * 
		 * ��ʼ��������Ϣ
		 * 01.������Ӧ������
		 * 02.�����ʼ��
		 * 03.��ʾ�˵������û������˵���
		 * 04.�����û���ͬ��ѡ�񣬽��벻ͬ�Ĺ���ģ��
		 */
		String[] names = new String[5]; // ������
		String[] dishMsgs = { "С�а趹��", "������", "Ƥ������", "���Ŷ���", "������" };// ��Ʒ
		double[] prices = { 15, 5.8, 50, 32, 6.6 }; // ��Ʒ��Ӧ�ĵ���
		int[] numbers = new int[5]; // ����
		String[] addresses = new String[5]; // �Ͳ͵�ַ
		Date[] dates = new Date[5]; // �Ͳ�ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String[] times = new String[5]; // �Ͳ�ʱ�� �û�������Ӧ�� 2017-08-13
		int[] states = new int[5]; // ����״̬ 0:�Ѿ�Ԥ�� 1���Ѿ����
		double[] sumPrices = new double[5]; // �ܽ��
		int[] praiseNums = new int[5]; // ���ޣ����ۣ� ����

		// ��ʼ�� ����

		names[0] = "С����";
		dishMsgs[0] = "С�а趹��";
		numbers[0] = 10;
		addresses[0] = "��������";
		dates[0] = new Date(); // ��ǰϵͳʱ��
		times[0] = sdf.format(dates[0]);// �û�������Ӧ�� 2017-08-13
		states[0] = 0; // �Ѿ�Ԥ��
		sumPrices[0] = 150;
		praiseNums[0] = 9999;

		names[1] = "�󶹸�";
		dishMsgs[1] = "Ƥ������";
		numbers[1] = 5;
		addresses[1] = "��������";
		dates[1] = new Date(); // ��ǰϵͳʱ��
		times[1] = sdf.format(dates[1]);// �û�������Ӧ�� 2017-08-13
		states[1] = 0; // �Ѿ�Ԥ��
		sumPrices[1] = 250;
		praiseNums[1] = 666;

		System.out.println("===========С�������ϵͳ===========");
		Scanner input = new Scanner(System.in);
		int num = -1;
		// ����һ����� ������ʶ �û��Ƿ��˳�ϵͳ
		boolean isExit = false;

		do {
			// ��ʾ�˵�
			System.out.println("��ǰϵͳʱ���ǣ�" + sdf.format(new Date()));
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("=============================================");
			System.out.println("�������룺");
			int choose = input.nextInt();
			switch (choose) {
			case 1: // ��Ҫ����
				System.out.println("============��Ҫ����============");
				// ����һ����� �����ʹ� ����û�� ���˾Ͳ��ܹ�����
				boolean flag = false;
				for (int i = 0; i < names.length; i++) { // ���� �����˵�����
					if (names[i] == null) { // ֤�����Զ���
						flag = true;// ���Թ���
						// �������еĲ�Ʒ +����+��������
						System.out.println("���\t\t\t��Ʒ\t\t\t����\t\t\t������");
						for (int j = 0; j < dishMsgs.length; j++) {
							System.out.println((j + 1) + "\t\t\t" + dishMsgs[j]
									+ "\t\t\t" + prices[j] + "\t\t\t"
									+ praiseNums[j]);
						}
						System.out.println("��������������");
						String name = input.next();
						System.out.println("��ѡ���Ʒ�ı�ţ�");
						int chooseDishName = input.nextInt();
						System.out.println("�����빺���Ʒ�ķ�����");
						int number = input.nextInt();
						System.out.println("�������Ͳ͵ĵ�ַ��");
						String address = input.next();
						System.out.println("�������Ͳ͵�ʱ�䣺��ʱ:��:�룩");
						String time = input.next();
						/**
						 * 01.���ܽ��
						 * 02.�Ƿ����Ͳͷ�    ����50���Ͳͷ� ����+10Ԫ
						 */
						double sumPrice = prices[chooseDishName - 1] * number; // �ܽ��
						double price = (sumPrice > 50) ? 0 : 10;// �Ƿ����Ͳͷ�
						System.out.println("������Ĳ�Ʒ���£�");
						System.out.println(dishMsgs[chooseDishName - 1]
								+ number + "��");
						System.out.println("�ͷѣ�" + sumPrice);
						System.out.println("�Ͳͷѣ�" + price);
						System.out.println("�ܽ�" + (price + sumPrice));

						// �������� (�ʹ�)���� �û����������
						names[i] = name;
						addresses[i] = address;
						times[i] = time;
						sumPrices[i] = (price + sumPrice);
						states[i] = 0;
						dishMsgs[i] = dishMsgs[chooseDishName - 1];
						numbers[i] = number;
						break;
					}
				}
				if (!flag) { // �ʹ�����
					System.out.println("�ʹ����������Ժ���........");
				}
				break;
			case 2: // �鿴�ʹ�

				System.out.println("============�鿴�ʹ�============");
				System.out
						.println("���\t\t\t������\t\t\t��Ʒ(����)\t\t\t״̬\t\t\t�ܽ��\t\t\t�Ͳ�ʱ��\t\t\t�Ͳ͵�ַ\t\t\t������");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) { // ���˶��� ��ʾ
						String state = (states[i] == 0) ? "�Ѿ�Ԥ��" : "�Ѿ����";
						System.out.println((i + 1) + "\t\t\t" + names[i]
								+ "\t\t\t" + dishMsgs[i] + (numbers[i])
								+ "\t\t\t" + state + "\t\t\t" + sumPrices[i]
								+ "\t\t\t" + times[i] + "\t\t\t" + addresses[i]
								+ "\t\t\t" + praiseNums[i]);
					}
				}
				break;
			case 3: // ǩ�ն���
				System.out.println("============�鿴�ʹ�============");
				/**
				 * ��Ҫ���ǵ����
				 * 01.״̬�Ѿ���ɣ�����Ҫǩ��
				 * 02.״̬�Ѿ�Ԥ������Ҫǩ��
				 * 03.û�д˶���������ǩ��
				 */
				System.out.println("������Ҫǩ�յĶ������:");
				int orderNum = input.nextInt();
				// ������ ��¼ �û��Ĵ���
				int sign = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[i] == 0
							&& (orderNum - 1) == i) { // �ж����������Ѿ�Ԥ������Ҫǩ��
						states[i] = 1;
						sign = 1;
						break;
					} else if (names[i] != null && states[i] == 1) {// �ж���������
						sign = 2; // �Ѿ���ɣ�������ǩ��
					}
				}
				if (sign == 1) {
					System.out.println("�����Ѿ�ǩ����ϣ�");
				} else if (sign == 2) {
					System.out.println("��������Ҫ�ظ�ǩ�գ�");
				} else {
					System.out.println("û�д˶���������ȷ��");
				}
				break;
			case 4: // ɾ������
				System.out.println("============ ɾ������============");
				/**
				 * 01.û�ж���
				 * 02.�ж���������û�����
				 * 03.�ж��������Ѿ���� ����ɾ��
				 */
				System.out.println("������Ҫɾ���Ķ������:");
				int delNum = input.nextInt();
				int delFlag = 0;
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null && states[delNum - 1] == 1) {// �ж��������Ѿ����
						for (int j = delNum - 1; j < names.length - 1; j++) { // ɾ��֮���λ��
																				// ǰ��
							names[j] = names[j + 1];
							dishMsgs[j] = dishMsgs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumPrices[j] = sumPrices[j + 1];
							numbers[j] = numbers[j + 1];
							praiseNums[j] = praiseNums[j + 1];
						}
						delFlag = 1; // �Ѿ�ɾ��
					} else if (names[i] != null && states[delNum - 1] == 0) { // ����û��ǩ�ղ���ɾ��
						delFlag = 2; // ����ɾ��
					}
				}

				if (delFlag == 1) {
					System.out.println("�����Ѿ�ɾ����ϣ�");
				} else if (delFlag == 2) {
					System.out.println("������ûǩ�գ�����ɾ��");
				} else {
					System.out.println("û�д˶���������ȷ��");
				}
				break;
			case 5: // ��Ҫ����
				System.out.println("============ ��Ҫ����============");
				System.out.println("���\t\t\t����");
				for (int i = 0; i < dishMsgs.length; i++) {
					System.out.println((i + 1) + "\t\t\t" + dishMsgs[i]);
				}

				System.out.println("����������޵Ĳ�Ʒ��ţ�");
				int chooseNum = input.nextInt();
				praiseNums[chooseNum - 1]++;
				System.out.println("���޳ɹ���");
				break;
			case 6: // �˳�ϵͳ
				isExit = true;
				break;
			}
			// �������ǵ�switch֮���ٴ����û��������˵�
			if (!isExit) {
				System.out.println("����0�������˵�");
				num = input.nextInt();
			}
		} while (num == 0);

	}
}
