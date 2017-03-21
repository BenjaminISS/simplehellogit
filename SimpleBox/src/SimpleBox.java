
public class SimpleBox  {

	/**
	 * @param args
	 */
	int width;
	int height;
	int length;
	
	public int Volume(int w, int h, int l) {
		
		return w*h*l;
	}
	
	public void displayVolume() {
		
		System.out.println("Simple Travis CI");
		return;
	}
	
	//Main function
	public static void main(String[] args) {
		
		SimpleBox b = new SimpleBox();
		b.width=2;
		b.height=2;
		b.length=3;
		
		System.out.println("Hello Simple Box "+b.Volume(2,2,3));

		b.displayVolume();
		
		int a1 = 1;
		int a2= 1;
		if (a1 == a2)
			System.out.println("Simple Equality");
	}

}
