package task_3;

public class Main {
    public static void main(String[] args) {
        Playable play = new Player();
        play.play();
        play.pause();
        Recordable record = new Player();
        record.record();
        play.stop();
    }
    /**
     * так як необхідно Написати програму, яка виконує програвання та запис.
     * я вивела методи в необхідній черговості.
     */
}
