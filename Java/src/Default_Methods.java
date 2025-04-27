interface Camera {
    void takeSnap();

    void recordVideo();
}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling number " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Picking call");
    }

    void takeSnap() {
        System.out.println("Snap taken");
    }
}

class ScreenTouch extends CellPhone implements Camera, Wifi {
    @Override
    public void takeSnap() {
        super.takeSnap();
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of networkList");
        String[] networkList = { "Ankit", "3G", "4G" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network " + network);
    }
}

public class Default_Methods {
    public static void main(String[] args) {
        ScreenTouch st = new ScreenTouch();
        String[] arr = st.getNetworks();

        for (String item : arr) {
            System.out.println(item);
        }
    }
}
