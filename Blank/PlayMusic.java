import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class PlayMusic {
	public static void main(String[] args) throws Exception, IOException {
		AudioInputStream audioInputStream;//file
		AudioFormat audioFormat;//format
		SourceDataLine sourceDataLine;//device to play
		File file = new File("1.mp3");
		System.out.println(file);
		audioInputStream = AudioSystem.getAudioInputStream(file);
		audioFormat = audioInputStream.getFormat();
		// mp3
		if (audioFormat.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
			audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
					audioFormat.getSampleRate(), 16, audioFormat.getChannels(),
					audioFormat.getChannels() * 2, audioFormat.getSampleRate(),
					false);
			audioInputStream = AudioSystem.getAudioInputStream(audioFormat,
					audioInputStream);
		}

		// open divice
		DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class,
				audioFormat, AudioSystem.NOT_SPECIFIED);
		sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
		sourceDataLine.open(audioFormat);
		sourceDataLine.start();
		
		byte tempBuffer[] = new byte[320];
		try {
			int cnt;
			//data
			while ((cnt = audioInputStream.read(tempBuffer, 0,
					tempBuffer.length)) != -1) {
				if (cnt > 0) {
					// buffer
					sourceDataLine.write(tempBuffer, 0, cnt);
				}
			}
			// Block wait
			sourceDataLine.drain();
			sourceDataLine.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}
