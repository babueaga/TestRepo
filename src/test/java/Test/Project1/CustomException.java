package Test.Project1;

public class CustomException {
	
	public void balaceCheck(int balance) throws LowBalanceException {
		if(balance < 100) {
			throw new LowBalanceException(balance + "is very less balance");
		}else {
			System.out.println("The given balance is good enough to continue");
		}
				
	}
	public static void main(String[] args) {
	
		CustomException obj = new CustomException();
		try {
			obj.balaceCheck(10);
		} catch (LowBalanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
