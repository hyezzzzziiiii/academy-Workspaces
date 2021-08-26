package days21;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection09 {
 // hashset 에는 없고 ArrayList에는 있는 listIterator : 양방향 방문 가능
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		ListIterator it = list.listIterator();
		while(it.hasNext())
			System.out.printf("%d ", it.next());  // 순방향으로 진행하면서 읽어온다.
		System.out.println();
		while(it.hasPrevious())
			System.out.printf("%d ", it.previous()); // 역방향으로 진행하면서 읽어온다
		System.out.println();
		

	}

}
