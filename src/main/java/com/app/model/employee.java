package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {
	@Id
	@Column(name="eid_col")
	private Integer eid;
	@Column(name="ename_col")
	private String ename;
	@Column(name="esal_col")
	private double esal;

}
