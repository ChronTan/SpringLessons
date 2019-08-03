package springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList=new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer(){}

    // IoC
    public MusicPlayer(List<Music> musicList){
        this.musicList=musicList;
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for(int i=0;i<musicList.size();i++){
            System.out.println("Playing: " + musicList.get(i).getSound());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
