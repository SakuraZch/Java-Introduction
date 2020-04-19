
// 2020/4/14 //

public class Logger
{
    String version = "1.5.1.1";
    private String format;
    public Logger(String str)
    {
        this.version = str;
        this.format = str + " format";
    }
    public String GetFormat()
    {
        return this.format;
    }
    public void SetFormat(String format)
    {
        this.format = format;
    }

    public static void main(String[] args)
    {
        Logger log = new Logger("1.6.1.1");
        System.out.println(log.GetFormat());
        log.SetFormat("1.7.6.5");
        System.out.println(log.GetFormat());
        System.out.println(log.version); 
        System.out.println(log.format);
        System.out.println(log.format);
        System.out.println(log.format);
        log.format = "1.1.1.1.1.1";
        System.out.println(log.format);

        // AudioPlayer aP = new AudioPlayer(1);
        // aP.OpenSpeaker();
        // StreamingAudioPayer sAP = new StreamingAudioPayer((2));
        // sAP.OpenSpeaker();
    }
}

// class AudioPlayer
// {
//     public AudioPlayer(int num1) {}
//     protected void OpenSpeaker()
//     {
//         System.out.println("AudioPlayer -> OpenSpeaker");
//     }
// }

// class StreamingAudioPayer extends AudioPlayer
// {
//     public StreamingAudioPayer(int num2)
//     {
//         AudioPlayer(num2);
//     }
//     protected void OpenSpeaker()
//     {
//         System.out.println("StreamingAudioPlayer -> OpenSpeaker");
//     }
// }