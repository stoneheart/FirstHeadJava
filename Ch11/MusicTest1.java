import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
    } // close play

    public void play2() throws MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
    }

    public static void main(String[] args) throws MidiUnavailableException {
        MusicTest1 mt = new MusicTest1();
        mt.play();
        mt.play2();
    } // close main
} // close class
