package ElectricityBill;

import java.time.LocalDate;


public class ElectricityBill {
	
	private int billNo;
	private LocalDate billDate;
	private int billAmt;
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public int getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}
	public ElectricityBill(int billNo, LocalDate billDate, int billAmt) {
		super();
		this.billNo = billNo;
		this.billDate = billDate;
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "ElectricityBill [billNo=" + billNo + ", billDate=" + billDate + ", billAmt=" + billAmt + "]";
	}

	
	
	

}
