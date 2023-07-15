package forPractice;



	abstract class Vehicle{
		public void drive() {
			
		System.out.println("driving");
		}
	}

	abstract class Car extends Vehicle {
		abstract void playmusic() ;
		
		}
	

	 class Bike extends Vehicle{
		public void start() {
			System.out.println("Starting!");
		}

		public void playmusic() {
			System.out.println("playing!");
		}
	}

	