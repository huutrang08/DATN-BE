
package vn.fs.dto;

import java.time.LocalDate;
import java.util.List;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private Long id;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String address;
	private Boolean gender;
	private Boolean status;
	private String image;
	private LocalDate registerDate;

	private List<String> roles;

	public JwtResponse(String accessToken, Long id, String name, String email, String password, String phone,
			String address, Boolean gender, Boolean status, String image, LocalDate registerDate, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.name = name;
		this.email = email;
		this.registerDate = registerDate;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.status = status;
		this.image = image;
		this.roles = roles;
	}

	public JwtResponse() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	

}
