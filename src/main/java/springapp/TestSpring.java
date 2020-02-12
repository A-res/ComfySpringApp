package springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        //TestBean testBean = context.getBean("testBean", TestBean.class);
        //Music music = context.getBean("MusicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //System.out.println(MusicBean.getName());
        MusicPlayer firstmusicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        boolean comp = firstmusicPlayer == secondmusicPlayer;
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);
        firstmusicPlayer.setVolume(10);
        System.out.println(comp);
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());
        //musicPlayer.playMusic();

        context.close();
    }
}
