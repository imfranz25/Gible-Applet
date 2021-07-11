import javax.sound.sampled.*;
import java.io.*;

public class sounds  {
	boolean plays;
    public void sound(){

	File audioFile=new File("C:\\Users\\Francis\\Documents\\Project OOP\\Pokemon.wav");
try{
try{
try{
	AudioInputStream audios=AudioSystem.getAudioInputStream(audioFile);
	AudioFormat format=audios.getFormat();
	DataLine.Info info=new DataLine.Info(Clip.class,format);
	Clip audioclip=(Clip)AudioSystem.getLine(info);
	audioclip.open(audios);

	audioclip.loop(1000000);

}catch(UnsupportedAudioFileException error){
	error.printStackTrace();
}
}catch(LineUnavailableException ss2){
	ss2.printStackTrace();
}
}catch(IOException asa){
	asa.printStackTrace();
}

}


}