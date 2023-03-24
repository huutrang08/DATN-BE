
package vn.fs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import vn.fs.common.ERole;

@SuppressWarnings("serial")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "appRoles")
public class AppRole implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	public ERole name;

	public AppRole(Integer id, ERole name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AppRole() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

}
