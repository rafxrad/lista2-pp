package adapter;

public class MPayAdapter implements PPay {
	
	MPay mpay;

	
	public MPayAdapter (MPay mpay) {
		this.mpay = mpay;
		
	}
	
	
	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return mpay.getCreditCardNo();
	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return mpay.getCustomerName();
	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return mpay.getCardExpMonth();
	}

	@Override
	public Integer getCVVNo() {
		// TODO Auto-generated method stub
		return mpay.getCardCVVNo().intValue();
	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return mpay.getAmount();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		mpay.setCreditCardNo(custCardNo);
		
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		mpay.setCustomerName(cardOwnerName);
		
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		mpay.setCardExpMonth(cardExpMonthDate);
		
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		mpay.setCardCVVNo(cVVNo.shortValue());
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		mpay.setAmount(totalAmount);
		
	}
	
	

}
