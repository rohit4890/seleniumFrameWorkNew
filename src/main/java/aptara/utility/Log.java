package aptara.utility;

import org.apache.log4j.Logger;

public class Log {
	
	// Initialize Log4j logs
		public static Logger logger = Logger.getLogger(Log.class.getName());
		
		public static void startTestCase(String testCaseName) {
			logger.info("<<================"+testCaseName+" method started.=============================>>");
		}
		
		public static void endTestCase(String testCaseName) {
			logger.info("<<=================="+testCaseName+" method ended.=============================>>");
		}
		
		public static void info(String message) {
			logger.info(message);
		}
		
		public static void warn(String message) {
			logger.warn(message);
		}
		
		public static void error(String message) {
			logger.error(message);
		}
		
		public static void fatal(String message) {
			logger.fatal(message);
		}

}
