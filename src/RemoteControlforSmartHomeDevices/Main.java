package RemoteControlforSmartHomeDevices;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TV tv = new TV();
        Stereo stereo = new Stereo();

        remote.setCommand(0, new TurnTVOn(tv));
        remote.setCommand(1, new SetVolume(stereo, 10));

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressUndo();
    }
}
