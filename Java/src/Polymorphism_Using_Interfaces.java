interface Camera1 {
    void takeSnap();

    void recordVideo();
}

interface Wifi1 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone1 {

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

class ScreenTouch1 extends CellPhone1 implements Camera1, Wifi1 {
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
        String[] networkList = { "Ankit1", "3G", "4G" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network " + network);
    }
}

public class Polymorphism_Using_Interfaces {
    public static void main(String[] args) {
        Camera1 cam2 = new ScreenTouch1();
        cam2.recordVideo();
        Wifi1 w2 = new ScreenTouch1();
        w2.connectToNetwork("Ankit1");
    }
}
