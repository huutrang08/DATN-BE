
package vn.fs.dto;

import java.util.Date;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Statistical {

	private int month;
	private Date date;
	private Double amount;
	private int count;
	public Statistical() {
		super();
	}
	public Statistical(int month, Date date, Double amount, int count) {
		super();
		this.month = month;
		this.date = date;
		this.amount = amount;
		this.count = count;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
