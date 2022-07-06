package objects;

	public class Members {	
	
		private String firstName;
		private String lastName;
		private String email;
		private String cellphoneNum;
		private String birthday;
		private String startDate;
		private String address;
		private String street;
		private String houseNumber;
		private String city;
		private String country;
		private String airCode;
		private String addressComplement;
		private String id;
		private String ibanAccount;
		private boolean status;
	
	public Members() {
				
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setCellphone(cellphoneNum);
		this.setBirthday(birthday);
		this.setStartDate(startDate);
		this.setAge(address);
		this.setStatus(status);
		this.setStreet(street);
		this.setHouseNumber(houseNumber);
		this.setCity(city);
		this.setCountry(country);
		this.setAirCode(airCode);
		this.setAddressComplement(addressComplement);
		this.setID(id);
		this.setIbanAccount(ibanAccount);
		
	}
	
	public void setStreet(String street) {
		this.street = street;	
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;	
	}
	public void setCity(String city) {
		this.city = city;	
	}
	public void setCountry(String country) {
		this.country = country;	
	}
	public void setAirCode(String airCode) {
		this.airCode = airCode;	
	}
	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;	
	}
	public void setID(String id) {
		this.id = id;	
	}
	public void setIbanAccount(String ibanAccount) {
		this.ibanAccount = ibanAccount;	
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCellphone(String cellphoneNum) {
		this.cellphoneNum = cellphoneNum;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public void setAge(String address) {
		this.address = address;		
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCellPhone() {
		return this.cellphoneNum;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public String getAge() {
		return this.address;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public String getStreet() {
		return this.street;
	}
	public String getHouseNumber() {
		return this.houseNumber;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getAirCode() {
		return this.airCode;
	}
	
	public String getAddressComplement() {
		return this.addressComplement;
	}
	
	public String getId() {
		return this.id;
	}
	public String getIbanAccount() {
		return this.ibanAccount;
	}
	
	public Members setMember(Members member) {
		return member;
	}
	

}
