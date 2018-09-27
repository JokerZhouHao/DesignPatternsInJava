package ch5Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite���ϳɣ�ģʽ
 * �ϳ�ģʽ��ͼ����������໥����������������������϶����뵥������ͬһ���ӿڣ�
 * ͬʱһ����϶���������õ��������������϶���������϶���������õ��������
 * ������϶��󣬶��ڽӿ��е�ĳЩ�����������ȡ������й��ж��ٸ������󣬾͵ò���
 * �����ķ�ʽ��ע������������ܻ���������������ѭ����
 */

interface Paper{
	int num();
}

class A4 implements Paper{
	public int num() {
		return 1;
	}
}

class Book implements Paper{
	List<Paper> papers = new ArrayList<>();
	
	public int num() {
		int num = 0;
		for(Paper pp : papers) {
			num += pp.num();
		}
		return num;
	}
}


public class CompositeTest {

	public static void main(String[] args) {
		
	}

}
