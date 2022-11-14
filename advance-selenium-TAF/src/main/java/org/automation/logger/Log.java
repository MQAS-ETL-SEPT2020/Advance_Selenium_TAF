package org.automation.logger;

import org.testng.Reporter;

/**
 * Log class to provide logging capabilities.
 * 
 * @author TYS-Megha D
 * @version 1.0.0
 * @since 14/11/2022
 *
 */
public final class Log {

	private Log() {
	}

	/**
	 * Provides the information logs.
	 * 
	 * @param message information message
	 */
	public static void info(String message) {
		LogConfig.getLogger().info(message);
		Reporter.log(message + "<br />");
	}

	/**
	 * Provides the error logs.
	 * 
	 * @param message error message
	 * @param error   the exception to log, including its stack trace
	 */
	public static void error(String message, Throwable error) {
		LogConfig.getLogger().error(message, error);
		Reporter.log(message + "<br />");
	}

	/**
	 * Provides the warning logs.
	 * 
	 * @param message warning message
	 */
	public static void warn(String message) {
		LogConfig.getLogger().warn(message);
		Reporter.log(message + "<br />");
	}

	/**
	 * Provides the debug logs.
	 * 
	 * @param message debug message
	 */
	public static void debug(String message) {
		LogConfig.getLogger().debug(message);
		Reporter.log(message + "<br />");
	}

	/**
	 * Provides the fatal logs.
	 * 
	 * @param message fatal messages
	 * @param error   the exception to log, including its stack trace
	 */
	public static void fatal(String message, Throwable error) {
		LogConfig.getLogger().fatal(message, error);
		Reporter.log(message + "<br />");
	}

}
