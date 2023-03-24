
package vn.fs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "rates")
public class Rate implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double rating;
	private String comment;
	private String image;
	private Date rateDate;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@OneToOne
	@JoinColumn(name = "orderDetailId")
	private OrderDetail orderDetail;

	@Override
	public String toString() {
		return "Rate [id=" + id + ", rating=" + rating + ", comment=" + comment + ", image=" + image
				+ ", rateDate=" + rateDate + ", user=" + user + ", product=" + product + ", orderDetail="
				+ orderDetail + "]";
	}
	
	public Rate() {
		super();
	}

	public Rate(Long id, Double rating, String comment,String image, Date rateDate, User user, Product product,
			OrderDetail orderDetail) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.image= image;
		this.rateDate = rateDate;
		this.user = user;
		this.product = product;
		this.orderDetail = orderDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getRateDate() {
		return rateDate;
	}

	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	

}
