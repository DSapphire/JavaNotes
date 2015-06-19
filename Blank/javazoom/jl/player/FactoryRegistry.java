package javazoom.jl.player;

import java.util.Enumeration;
import java.util.Hashtable;
import javazoom.jl.decoder.JavaLayerException;

public class FactoryRegistry
  extends AudioDeviceFactory
{
  private static FactoryRegistry instance = null;
  protected Hashtable factories = new Hashtable();
  
  public static synchronized FactoryRegistry systemRegistry()
  {
    if (instance == null)
    {
      instance = new FactoryRegistry();
      instance.registerDefaultFactories();
    }
    return instance;
  }
  
  public void addFactory(AudioDeviceFactory paramAudioDeviceFactory)
  {
    this.factories.put(paramAudioDeviceFactory.getClass(), paramAudioDeviceFactory);
  }
  
  public void removeFactoryType(Class paramClass)
  {
    this.factories.remove(paramClass);
  }
  
  public void removeFactory(AudioDeviceFactory paramAudioDeviceFactory)
  {
    this.factories.remove(paramAudioDeviceFactory.getClass());
  }
  
  public AudioDevice createAudioDevice()
    throws JavaLayerException
  {
    AudioDevice localAudioDevice = null;
    AudioDeviceFactory[] arrayOfAudioDeviceFactory = getFactoriesPriority();
    if (arrayOfAudioDeviceFactory == null) {
      throw new JavaLayerException(this + ": no factories registered");
    }
    Object localObject = null;
    for (int i = 0; (localAudioDevice == null) && (i < arrayOfAudioDeviceFactory.length); i++) {
      try
      {
        localAudioDevice = arrayOfAudioDeviceFactory[i].createAudioDevice();
      }
      catch (JavaLayerException localJavaLayerException)
      {
        localObject = localJavaLayerException;
      }
    }
    if ((localAudioDevice == null) && (localObject != null)) {
      throw new JavaLayerException("Cannot create AudioDevice", (Throwable)localObject);
    }
    return localAudioDevice;
  }
  
  protected AudioDeviceFactory[] getFactoriesPriority()
  {
    AudioDeviceFactory[] arrayOfAudioDeviceFactory = null;
    synchronized (this.factories)
    {
      int i = this.factories.size();
      if (i != 0)
      {
        arrayOfAudioDeviceFactory = new AudioDeviceFactory[i];
        int j = 0;
        Enumeration localEnumeration = this.factories.elements();
        while (localEnumeration.hasMoreElements())
        {
          AudioDeviceFactory localAudioDeviceFactory = (AudioDeviceFactory)localEnumeration.nextElement();
          arrayOfAudioDeviceFactory[(j++)] = localAudioDeviceFactory;
        }
      }
    }
    return arrayOfAudioDeviceFactory;
  }
  
  protected void registerDefaultFactories()
  {
    addFactory(new JavaSoundAudioDeviceFactory());
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\FactoryRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */