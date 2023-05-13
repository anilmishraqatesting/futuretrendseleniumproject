package futuretrend.capibilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserCapibilities extends Browsercapibilties {
	
	public static ChromeOptions option=new ChromeOptions();

	@Override
	void setdownloadPath() {
		
		String path=System.getProperty("user.dir")+"\\download";
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("download.default_directory", path);
		
		option.setExperimentalOption("map", map);
		
		
		
		
		
		
	}

}
