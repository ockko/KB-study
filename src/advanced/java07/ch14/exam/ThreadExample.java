package advanced.java07.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread movieThread = new MovieThread();
        Thread musicRunnable = new Thread(new MusicRunnable());

        movieThread.start();
        musicRunnable.start();
    }
}
