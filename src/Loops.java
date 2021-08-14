class Loopy {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the Loop");
		while (x < 4) {
			System.out.println("In the loop");
			System.out.println("Value of x is " + x);
			x = x + 1;
		}

		Car a = new Car("Jeff");
		CustomObject<Car> obj = new CustomObject(a);

		System.out.println("This is after the loop");
		System.out.println("Value of x is " + obj.x.name);
	}
}

class Car {
	public String name;
	
	public Car(String name) {
		this.name = name;
	}
}

class CustomObject<T> {
	public T x;

	public CustomObject(T x) {
		this.x = x;
	}
}