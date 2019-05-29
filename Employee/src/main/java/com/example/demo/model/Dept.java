package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dept database table.
 * 
 */
@Entity
@NamedQuery(name="Dept.findAll", query="SELECT d FROM Dept d")
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int did;

	private int eid;

	private String name;

	public Dept() {
	}

	public int getDid() {
		return this.did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}