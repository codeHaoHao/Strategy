package test;

import java.util.List;

import strategy.Algorithm;
import utils.ClassUtils;

public class Test2 {
	public static void main(String[] args) {
		List<Class<?>> list = ClassUtils.getAllClassByInterface(Algorithm.class);
		
		System.out.println("实现" + Algorithm.class.getSimpleName() + "的类：" );
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getSimpleName());
		}
	}
}
