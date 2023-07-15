
 public class Main {
		
		public static void main(String[] args) {
			try {
				throw new CustomException("Custom exception thrown");
				
			} catch (Exception e) {
				System.out.println("caught custom exception: " + e.getMessage());
			}
			
		}
	}
