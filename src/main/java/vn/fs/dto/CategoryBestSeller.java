
package vn.fs.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CategoryBestSeller {

	private String name;
	private int count;
	private Double amount;
	public CategoryBestSeller() {
		super();
	}
	public CategoryBestSeller(String name, int count, Double amount) {
		super();
		this.name = name;
		this.count = count;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	

}
