

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sunday.refactoring.common.RequestUtil;

import java.io.IOException;
import java.util.Properties;


public class ReadProperty {

	public static final Properties p = new Properties();

	static {
		try {
			p.load(RequestUtil.class.getResourceAsStream("../config/config.properties"));
		} catch (Exception e) {
			
		}
	}
}
