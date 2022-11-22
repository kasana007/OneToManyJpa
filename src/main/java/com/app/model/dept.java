package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="dept_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class dept {
	@Id
	@Column(name="did_col")
	private Integer did;
	@Column(name="dname_col")
    private String dname;
	@Column(name="adminName_col")
    private String adminName;
	
	@OneToMany
	@JoinColumn(name="did_FK")
	private List<employee> emp;  // Has-A relation

}
