
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
@Table(name = "cartDetails")
public class CartDetail implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartDetailId;
	private int quantity;
	private Double price;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "cartId")
	private Cart cart;

	public CartDetail() {
		super();
	}

	public CartDetail(Long cartDetailId, int quantity, Double price, Product product, Cart cart) {
		super();
		this.cartDetailId = cartDetailId;
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		this.cart = cart;
	}

	public Long getCartDetailId() {
		return cartDetailId;
	}

	public void setCartDetailId(Long cartDetailId) {
		this.cartDetailId = cartDetailId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
