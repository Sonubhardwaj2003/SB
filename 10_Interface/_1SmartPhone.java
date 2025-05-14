class phone{
    public void call(){
        System.out.println("phone call");
    }
    public void sms(){
        System.out.println("phone Sms");
    }
}

interface camera {
    void click();
    void snap();
    void record();
}

interface musicplayer{
    void play();
    void pause();
    void stop();
    void next();
}

class smartphone extends phone implements camera,musicplayer{
    public void videocall(){System.out.println(" videocall");}
    
    public void click(){System.out.println("Click");}
    
    public void snap(){System.out.println("Snap");}

    public void record(){System.out.println("video record");}

    public void play(){System.err.println("play song");}

    public void pause(){System.out.println("pause Song");}

    public void stop(){System.out.println("Stop song");}

    public void next(){System.out.println("play next");}
}

public class _1SmartPhone {
    public static void main(String[] args) {
        
        smartphone s=new smartphone();

        s.call();
        s.click();
        s.next();
        s.pause();
        s.play();
        s.record();
        s.sms();
        s.snap();
        s.stop();
        s.videocall();

    }
}
