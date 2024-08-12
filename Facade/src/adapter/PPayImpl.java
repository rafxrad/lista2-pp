package adapter;

public class PPayImpl implements PPay{

	
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cvvNo;
	private Double totalAmount;
	

	public PPayImpl(String custCardNo, String cardOwnerName, String cardExpMonthDate, Integer cvvNo,
			Double totalAmount) {
		this.custCardNo = custCardNo;
		this.cardOwnerName = cardOwnerName;
		this.cardExpMonthDate = cardExpMonthDate;
		this.cvvNo = cvvNo;
		this.totalAmount = totalAmount;
	}

	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCVVNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		// TODO Auto-generated method stub
		
	}

}
