package entity;

public class Reader {


    private int readerId;
    private String fullName;
    private String address;
    private String phoneNumber;

    public Reader() {
    }

    public Reader(int readerId) {
        this.readerId = readerId;
    }

    public Reader(int readerId, String fullName, String address, String phoneNumber) {
        this.readerId = readerId;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader [ ReaderId: "
                + readerId +  " | Full name: " + fullName + " | Address: "
                + address +   " | Phone number: " + phoneNumber +" ]";
    }
}
