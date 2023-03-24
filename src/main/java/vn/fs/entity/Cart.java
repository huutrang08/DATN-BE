
package vn.fs.entity;

import java.io.Serializable;

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
@Table(name = "carts")
public class Cart implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
	private Double Amount;
	private String address;
	private String phone;
	

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Cart() {
		super();
	}

	public Cart(Long cartId, Double amount, String address, String phone, User user) {
		super();
		this.cartId = cartId;
		Amount = amount;
		this.address = address;
		this.phone = phone;
		this.user = user;
	
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
