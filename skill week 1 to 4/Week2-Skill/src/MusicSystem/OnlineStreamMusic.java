package MusicSystem;

public class OnlineStreamMusic implements MusicSource {
	private String url;

    public OnlineStreamMusic(String url) {
        this.url = url;
    }

    public void play() {
        System.out.println("Playing melodious music from: " + url);
    }
}
