package framework;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.PropertiesConfigurationLayout;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//Helps us in reading the values from the properties files
public class PropertiesUtil {

    private InputStreamReader isr;
    private PropertiesConfiguration propertiesConfiguration;
    private PropertiesConfigurationLayout propertiesConfigurationLayout;

    public PropertiesUtil()
    {
        try
        {
            //Reads the Complete data from the properties file
            isr=new InputStreamReader(new FileInputStream("Configuration.properties"));
            propertiesConfiguration=new PropertiesConfiguration();
            propertiesConfigurationLayout=new PropertiesConfigurationLayout();

            //Loading the data from the input stream reader into the config object
            propertiesConfigurationLayout.load(propertiesConfiguration,isr);
        }

        catch (Exception e2)
        {

        }
    }

    public String getPropertyValue(String key)
    {
        return propertiesConfiguration.getProperty(key).toString();
    }

    public String getURL()
    {
        return getPropertyValue("URL");
    }

    public String getBrowser()
    {
        return getPropertyValue("Browser");
    }
}
