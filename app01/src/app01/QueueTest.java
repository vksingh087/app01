package app01;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		
		for(int i=1;i<=10;i++)
		{
			q.add(i);
		}
        System.out.println("Elements in a queue: "+q);
		for(int i=1;i<=10;i++)
		{
			int removedele = (Integer)q.remove();
	        System.out.println("removed element : "+ removedele);
		}
		 System.out.println("Elements in a queue: "+q);
	}

}
