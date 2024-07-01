package com.hospital;

public class Hospital {
	private String hName;
    private String hAddress;
    private String hContactNumber;
    private String hEmail;
    private String hLicenseNumber;
    private String hWorkinghours;
    
	public Hospital(String hName, String hAddress, String hContactNumber, String hEmail, String hLicenseNumber,
			String hWorkinghours) {
		super();
		this.hName = hName;
		this.hAddress = hAddress;
		this.hContactNumber = hContactNumber;
		this.hEmail = hEmail;
		this.hLicenseNumber = hLicenseNumber;
		this.hWorkinghours = hWorkinghours;		
	}

	public String gethName() {
		return hName;
	}

	public String gethAddress() {
		return hAddress;
	}

	public String gethContactNumber() {
		return hContactNumber;
	}

	public String gethEmail() {
		return hEmail;
	}

	public String gethLicenseNumber() {
		return hLicenseNumber;
	}

	public String gethWorkinghours() {
		return hWorkinghours;
	}
}
