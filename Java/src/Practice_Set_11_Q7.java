interface TVRemote1 {
    void powerOn();

    void powerOff();
}

interface SmartTVRemote1 extends TVRemote1 {
    void volumeUp();

    void volumeDown();
}

class TV implements SmartTVRemote1, TVRemote1 {
    @Override
    public void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
}

public class Practice_Set_11_Q7 {
    public static void main(String[] args) {
        // Create a class TV which implements TVRemote interface from Question 6

        TV obj = new TV();
        obj.powerOn();
        obj.powerOff();
        obj.volumeUp();
        obj.volumeDown();
    }
}
