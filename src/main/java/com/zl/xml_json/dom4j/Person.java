package com.zl.xml_json.dom4j;

public class Person {
	private String personid;
	private String name;
	private String address;
	private String tel;
	private String fax;
	private String email;
	public Person(String personid, String name, String address, String tel, String fax, String email) {
		super();
		this.personid = personid;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", name=" + name + ", address=" + address + ", tel=" + tel + ", fax="
				+ fax + ", email=" + email + "]";
	}
	
}
