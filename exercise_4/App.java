import java.util.LinkedList;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		Queue<String> INF214stdnts = new LinkedList<>();

		//Enqueue 5 of your classmates in this section
		INF214stdnts.add("Neil Rifarial");
		INF214stdnts.add("James Jalalon");
		INF214stdnts.add("Kean Lalo");
		INF214stdnts.add("Carlos Legaspi");
		INF214stdnts.add("Justine Abella");
		System.out.println("Students enrolled: " + INF214stdnts);
		
		//Get the size of the queue
		System.out.println("Number of students enrolled in this course: " + INF214stdnts.size());
		
		//Get the front of the queue
		System.out.println("Student at the front of the queue is: " + INF214stdnts.peek());
		
		//Dequeue 5 of your classmates 
		INF214stdnts.remove();
		INF214stdnts.remove();
		INF214stdnts.remove();
		INF214stdnts.remove();
		INF214stdnts.remove();

        	//Enqueue another 5 of you classmates
		INF214stdnts.add("Jonnah Hermosura");
		INF214stdnts.add("Christian Bantegui");
		INF214stdnts.add("Alexander John Du");
		INF214stdnts.add("Lawrence Aranilla");
		INF214stdnts.add("Elaine Victoria");
		
		System.out.println("Students enrolled in this course: " + INF214stdnts);
		
		//Get the size of the queue
		System.out.println("Number of students enrolled in this course: " + INF214stdnts.size());
		
		//Get the front of the queue
		System.out.println("Student at the front of the queue is: " + INF214stdnts.peek());
	
	}
}
