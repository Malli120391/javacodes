package org.malleswara.spring.springcore.dependenceycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String pname;
	private List<String> medicines;
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", pname=" + pname + ", medicines=" + medicines + "]";
	}
	
	
}
