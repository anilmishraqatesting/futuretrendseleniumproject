package futuretrend.capibilities;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxBrowserCapbilities extends Browsercapibilties {
	
	public static FirefoxOptions option=new FirefoxOptions();

	@Override
	void setdownloadPath() {
		
		
		String path=System.getProperty("user.dir")+"\\download";
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.dir", path);
		option.setProfile(profile);
		
		
	}

}
