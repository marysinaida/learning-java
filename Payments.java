public class Payments {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String network;

    private double amount;
    
    private String currency;

public Payments(String phoneNumber, String network ,double amount, String currency);
}
