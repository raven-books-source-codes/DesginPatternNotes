package desginpattern.facade;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/4 19:55
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLights theaterLights;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        popcorn = new Popcorn();
        projector = new Projector();
        screen = new Screen();
        stereo = new Stereo();
        theaterLights = new TheaterLights();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.down();
        stereo.on();
        theaterLights.off();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        dvdPlayer.off();
        popcorn.off();
        screen.up();
        stereo.off();
        theaterLights.off();
    }
}
