package interfaces;

class phone{
    public void call(){
        System.out.println("Phone is calling");
    }
    public void sms(){
        System.out.print("Phone is smsing");
    }
}
interface ICamera {
    void click();
    void record();
}
interface IMusicplayer {
    void play();
    void pause();
    void stop();
}
class Smartphone extends phone implements ICamera, IMusicplayer {
    public void call(){
        System.out.println("Smartphone is calling");
    }
    public void sms(){
        System.out.println("Smartphone is smsing");
    }
    public void click(){
        System.out.println("Camera is clicking");
    }
    public void record(){
        System.out.println("Camera is recording");
    }
    public void play(){
        System.out.println("Music player is playing");
    }
    public void pause(){
        System.out.println("Music player is pausing");
    }
    public void stop(){
        System.out.println("Music player is stopping");
    }
}
public class smartphonemain {
    public static void main(String[] args){
        Smartphone s = new Smartphone();
        phone p = new Smartphone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        p.call();
    }
}