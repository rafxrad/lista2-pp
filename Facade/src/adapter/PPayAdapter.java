package adapter;

public class PPayAdapter implements MPay {
	
	PPay ppay;
	
	public PPayAdapter(PPay ppay) {
		
		this.ppay = ppay;
		
	}

	@Override
	public String getCreditCardNo() {
		// TODO Auto-generated method stub
		return ppay.getCustCardNo();
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return ppay.getCardOwnerName();
	}

	@Override
	public String getCardExpMonth() {
		// TODO Auto-generated method stub
		return ppay.getCardExpMonthDate();
	}


	@Override
	public Short getCardCVVNo() {
		// TODO Auto-generated method stub
		return ppay.getCVVNo().shortValue();
	}

	@Override
	public Double getAmount() {
		// TODO Auto-generated method stub
		return ppay.getTotalAmount();
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		// TODO Auto-generated method stub
		ppay.setCustCardNo(creditCardNo);
		
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		ppay.setCardOwnerName(customerName);
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		// TODO Auto-generated method stub
		ppay.setCardExpMonthDate(cardExpMonth);
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		// TODO Auto-generated method stub
		ppay.setCVVNo(cardCVVNo.intValue());
	}

	@Override
	public void setAmount(Double amount) {
		// TODO Auto-generated method stub
		ppay.setTotalAmount(amount);
	}

	@Override
	public String getCardExpYear() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
