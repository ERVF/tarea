public class CarApplication {
	public static void main(String[] args) {
		
		Car car1 = new Car("Ford,", 5, "Manual,", "120,");
		System.out.println(car1.showState());
		System.out.println(car1.accelerate());
		System.out.println(car1.stop());
		
		Car car2 = new Car("Nissan,", 6, "Automática,", "180,");
		System.out.println(car2.showState());
		System.out.println(car2.accelerate());
		System.out.println(car2.stop());
		
		Car car3 = new Car("THONDERVOCHO,", 4, "Estándar,", "40,");
		System.out.println(car3.showState());
		System.out.println(car3.accelerate());
		System.out.println(car3.stop());
		
		SmallCar mini1 = new SmallCar(2);
		System.out.println(mini1.showState());
		System.out.println(mini1.accelerate());
		System.out.println(mini1.seatsNumber());
		
		Bicycle bici1 = new Bicycle();
		bici1.turnLeft();
		bici1.turnRight();
		bici1.applyBrake();
		bici1.accelerate();
	}

}
