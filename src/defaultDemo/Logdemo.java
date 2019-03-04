package defaultDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logdemo {

	private static final Logger log = LogManager.getLogger(Logdemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug(" Debug message logged");
		log.error(" Error message logged");
	}

}
