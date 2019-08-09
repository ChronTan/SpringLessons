package springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean",Music.class);
//
//        MusicPlayer musicPlayer=new MusicPlayer(music);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer1=context.getBean("musicPlayer",MusicPlayer.class);
        boolean comparison=musicPlayer==musicPlayer1;

        musicPlayer.setVolume(10);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}
