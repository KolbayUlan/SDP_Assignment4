package RemoteControlforSmartHomeDevices;

// Command to set volume
public class SetVolume implements Command {
    private Stereo stereo;
    private int previousVolume;
    private int volume;

    public SetVolume(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void execute() {
        previousVolume = stereo.getVolume();
        stereo.setVolume(volume);
    }

    @Override
    public void undo() {
        stereo.setVolume(previousVolume);
    }
}

