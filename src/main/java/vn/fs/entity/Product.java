
package vn.fs.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String name;
	private int quantity;
	private Double price;
	private int discount;
	private String image;
	private String description;
	private LocalDate enteredDate;
	private Boolean status;
	private int sold;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", discount=" + discount + ", image=" + image + ", description=" + description + ", enteredDate="
				+ enteredDate + ", status=" + status + ", sold=" + sold + ", category=" + category + "]";
	}

	public Product() {
		super();
	}

	public Product(Long productId, String name, int quantity, Double price, int discount, String image,
			String description, LocalDate enteredDate, Boolean status, int sold, Category category) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.image = image;
		this.description = description;
		this.enteredDate = enteredDate;
		this.status = status;
		this.sold = sold;
		this.category = category;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(LocalDate enteredDate) {
		this.enteredDate = enteredDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

}
