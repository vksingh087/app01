package app01;
interface IRobot{
	void method();
	String toString();
}
public class Robot4 {

	public static void main(String[] args) {
		new IRobot() {
			
			@Override
			public void method() {
				System.out.println("HERE");
				
			}
		}.method();
		
		System.out.println(new IRobot() {
			
			
				public String toString() {
					return "HEREEEEEE";
				}
		
				public void method() {
					
				}
			
		});

	}

}
