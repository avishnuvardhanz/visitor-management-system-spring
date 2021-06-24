package net.vishnu.vms.model;



public class Visitor {
	private Integer id;
	private String visitorname;
	private String mobilenumber;
	private String address;
	private String apartment;
	private String floor;
	private String whomtomeet;
	private String reasontomeet;
	private String remark;
	private String enterdate;
	private String outtime;
	private String username;





	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEnterdate() {
		return enterdate;
	}



	public void setEnterdate(String enterdate) {
		this.enterdate = enterdate;
	}



	public String getOuttime() {
		return outtime;
	}



	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getVisitorname() {
		return visitorname;
	}



	public void setVisitorname(String visitorname) {
		this.visitorname = visitorname;
	}



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getApartment() {
		return apartment;
	}



	public void setApartment(String apartment) {
		this.apartment = apartment;
	}



	public String getFloor() {
		return floor;
	}



	public void setFloor(String floor) {
		this.floor = floor;
	}



	public String getWhomtomeet() {
		return whomtomeet;
	}



	public void setWhomtomeet(String whomtomeet) {
		this.whomtomeet = whomtomeet;
	}



	public String getReasontomeet() {
		return reasontomeet;
	}



	public void setReasontomeet(String reasontomeet) {
		this.reasontomeet = reasontomeet;
	}



	public Visitor()
	{
		
	}
	
public Visitor(Integer id,String visitorname, String mobilenumber, String address, String apartment,
		String floor, String whomtomeet, String reasontomeet) {
	
	this(visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet); 	 
	this.id=id;
	
	
}

	
public Visitor(Integer id,String visitorname, String mobilenumber, String address, String apartment,
		String floor, String whomtomeet, String reasontomeet,String remark) {
	
	this(visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark); 	 
	this.id=id;
	
	
}
public Visitor(Integer id,String visitorname, String mobilenumber, String address, String apartment,
		String floor, String whomtomeet, String reasontomeet,String remark,String enterdate,String outtime) {
	
	this(visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark,enterdate,outtime); 	 
	this.id=id;
	
	
}


	public Visitor(String visitorname, String mobilenumber, String address, String apartment,
			String floor, String whomtomeet, String reasontomeet,String remark) {
		
	
		this.visitorname = visitorname;
		this.mobilenumber = mobilenumber;
		this.address= address;
		this.apartment = apartment;
		this.floor = floor;
		this.whomtomeet = whomtomeet;
		this.reasontomeet = reasontomeet;
		this.remark=remark;
	}

	public Visitor(String visitorname, String mobilenumber, String address, String apartment,
			String floor, String whomtomeet, String reasontomeet) {
		
	
		this.visitorname = visitorname;
		this.mobilenumber = mobilenumber;
		this.address= address;
		this.apartment = apartment;
		this.floor = floor;
		this.whomtomeet = whomtomeet;
		this.reasontomeet = reasontomeet;
		
	}
	public Visitor(String visitorname, String mobilenumber, String address, String apartment,
			String floor, String whomtomeet, String reasontomeet,String remark,String enterdate,String outtime) {
		
	
		this.visitorname = visitorname;
		this.mobilenumber = mobilenumber;
		this.address= address;
		this.apartment = apartment;
		this.floor = floor;
		this.whomtomeet = whomtomeet;
		this.reasontomeet = reasontomeet;
		this.remark=remark;
		this.enterdate=enterdate;
		this.outtime=outtime;
	}





	
}
