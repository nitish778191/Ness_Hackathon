package org.example;

import java.text.SimpleDateFormat;

public class Donor extends Person{

    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public Donor(String name, String dateOfBirth, String gender, String mobileNumber, String bloodGroup, String bloodBankName, String donorType, String donationDate) {
        super(name, dateOfBirth, gender, mobileNumber, bloodGroup);
        this.bloodBankName = bloodBankName;
        this.donorType = donorType;
        this.donationDate = donationDate;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails(){
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Donation Details");
        System.out.println("Name : "+getName());
        System.out.println("Date Of Birth : "+getDateOfBirth());
        System.out.println("Gender : "+getGender());
        System.out.println("Mobile Number : "+getMobileNumber());
        System.out.println("Blood Group : "+getBloodGroup());
        System.out.println("Blood Bank Name : "+getBloodBankName());
        System.out.println("Donor Type : "+getDonorType());
        System.out.println("Donation Date : "+getDonationDate());
    }

}
