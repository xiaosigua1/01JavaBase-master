package cn.bdqn.test;

public class PageTest {

	/**
	 * 
	 *   ������                ҳ��С                 ��ҳ��
	 *   counts      pageSize       pageCount
	 *     100          10            10
	 *     100          99             2
	 *   
	 *     500          25                           ��
	 *     
	 *     ˼·��
	 *     
	 *     �������� �� ҳ��С ����ȡ�������
	 *     01.û������     ��������/ҳ��С
	 *     02.������        ��������/ҳ��С+1
	 *     
	 */
	public static void main(String[] args) {

		// ���� ��������
		int counts = 100;
		// ���� ҳ��С
		int pageSize = 10;
		// ��ȡ��ҳ��
		int pageCount = (counts % pageSize == 0) ? (counts / pageSize)
				: (counts / pageSize + 1);
		System.out.println("��ҳ���ǣ�" + pageCount);
	}

}
