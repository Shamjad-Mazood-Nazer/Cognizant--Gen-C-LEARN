package com.spring.app;

public class MemberShip {
    private int membershipId;
    private String membershipType;
    private int visitsPerYear;
    private Customer customer;

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setVisitsPerYear(int visitsPerYear) {
        this.visitsPerYear = visitsPerYear;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    public void setCustomer(Customer Customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public MemberShip(int membershipId, String membershipType, int visitsPerYear, Customer customer) {
        super();
        this.membershipId = membershipId;
        this.membershipType = membershipType;
        this.visitsPerYear = visitsPerYear;
        this.customer = customer;
    }
}
