package ch5Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite（合成）模式
 * 合成模式试图解决类与类相互关联的情况。这种情况中组合对象与单对象共享同一个接口，
 * 同时一个组合对象可以引用单对象或者其他组合对象。由于组合对象可以引用单对象或者
 * 其他组合对象，对于接口中的某些方法，例如获取组合类中共有多少个单对象，就得采用
 * 遍历的方式，注意这种情况可能会碰到环，或者死循环。
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
