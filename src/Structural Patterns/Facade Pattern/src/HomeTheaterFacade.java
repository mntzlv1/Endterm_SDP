// HomeTheaterFacade.java
// Facade class to simplify the home theater operations.
class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() { // Constructor
        tv = new TV();
        dvdPlayer = new DVDPlayer();
        soundSystem = new SoundSystem();
    }

    public void watchMovie() {
        tv.on();
        soundSystem.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        dvdPlayer.stop();
        soundSystem.off();
        tv.off();
    }
}
