package common;

public class Config {
    /**
     * Specify the browser and the platform for test;
     * CHROME_WINDOWS
     */
    public static final String PLATFORM_AND_BROWSER = "CHROME_WINDOWS";
    /**
     * Clean browser cookies after each iteraction
     */
    public static final Boolean CLEAR_COOKIES = false;
    /**
     * To keep the browser open after all scenarios/ tests
     */
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /**
     * Clear the directory with the screen before starting the build
     */
    public static final Boolean CLEAR_REPORTS_DIR = true;

}
