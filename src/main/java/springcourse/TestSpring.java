package springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean",Music.class);

//        MusicPlayer musicPlayer=new MusicPlayer(music);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        ClassicalMusic classicalMusic=context.getBean("classicalMusicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getName());


        music=context.getBean("mBean",Music.class);
        musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
