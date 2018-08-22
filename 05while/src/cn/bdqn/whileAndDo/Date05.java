package cn.bdqn.whileAndDo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date05 {

	/**
	 * 2017-08-03   ���ڸ�ʽ���ַ���
	 * 
	 * Thu Aug 03 15:57:18 CST 2017  ����
	 * 
	 *  ʵ�����ں��ַ���֮����໥ת��
	 *  01.format()  ������ת�����ַ���
	 *  02.parse()   ���ַ���ת��������
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// ������һ�����ڶ��� new Date() ����ǰϵͳʱ��
		Date date = new Date();
		System.out.println("��ǰʱ���ǣ�" + date);
		System.out.println("********************");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(date); // ������ת�����ַ���
		System.out.println(time);
		System.out.println("********************");
		date = sdf.parse(time);// ���ַ���ת��������
		System.out.println(date);

	}

}
