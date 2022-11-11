import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

public Payments(String phoneNumber, String network ,double amount, String currency)


    chooseNetwork(NetworkType.AIRTEL_TIGO);

    List<String> seniorNames = new ArrayList<>();
    seniorNames.add("Bright");

    List<String> juniorNames = new ArrayList<>();
    juniorNames.add("Tinny");

    seniorNames.addAll(juniorNames);

    HashMap<Integer,String>seniorNameHash = new HashMap<>();
    seniorNameHash.put(10,"Bright");
}

   
/**
 * @param networkType
 */
private void chooseNetwork(NetworkType networkType){
    networkType.name();
}

}
