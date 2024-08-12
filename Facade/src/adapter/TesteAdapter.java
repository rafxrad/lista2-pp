package adapter;

public class TesteAdapter {

	public static void main(String[] args) {
		
		
		MPay mpay = new MPayImpl("2344.4050.3040-55", "Rafaella Costa", "08", "2024", (short) 123, 3.500);
		
		PPay PayPalAdapter = new MPayAdapter(mpay);
		
		testPPay(PayPalAdapter);
	}
	
	
	
	public static void testPPay(PPay pp){
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
		}

}
