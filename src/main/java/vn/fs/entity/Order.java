
package vn.fs.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "orders")
public class Order implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ordersId;
	private Date orderDate;
	private Double amount;
	private String address;
	private String phone;
	private int status;
	private String note;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Order() {
		super();
	}

	public Order(Long ordersId, Date orderDate, Double amount, String address, String phone, int status, User user, String note) {
		super();
		this.ordersId = ordersId;
		this.orderDate = orderDate;
		this.amount = amount;
		this.address = address;
		this.phone = phone;
		this.status = status;
		this.user = user;
		this.note = note;
	}

	public Long getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
