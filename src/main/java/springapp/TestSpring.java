package springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        //TestBean testBean = context.getBean("testBean", TestBean.class);
        Music music = context.getBean("MusicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        //System.out.println(MusicBean.getName());
        musicPlayer.playMusic();

        context.close();
    }
}
