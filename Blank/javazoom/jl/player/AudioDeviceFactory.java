package javazoom.jl.player;

import javazoom.jl.decoder.JavaLayerException;

public abstract class AudioDeviceFactory
{
  public abstract AudioDevice createAudioDevice()
    throws JavaLayerException;
  
  protected AudioDevice instantiate(ClassLoader paramClassLoader, String paramString)
    throws ClassNotFoundException, IllegalAccessException, InstantiationException
  {
    AudioDevice localAudioDevice = null;
    Class localClass = null;
    if (paramClassLoader == null) {
      localClass = Class.forName(paramString);
    } else {
      localClass = paramClassLoader.loadClass(paramString);
    }
    Object localObject = localClass.newInstance();
    localAudioDevice = (AudioDevice)localObject;
    return localAudioDevice;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\AudioDeviceFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */