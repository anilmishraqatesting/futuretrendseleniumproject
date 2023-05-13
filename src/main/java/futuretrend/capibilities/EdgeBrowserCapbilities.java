package futuretrend.capibilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowserCapbilities extends Browsercapibilties {
	
	public static EdgeOptions option=new EdgeOptions();

	@Override
	void setdownloadPath() {
		
        String path=System.getProperty("user.dir")+"\\download";
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("download.default_directory", path);
		
		option.setExperimentalOption("map", map);
		
		
	}
	
	
	
	
	

}
