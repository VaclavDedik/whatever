package whatever;

/**
 * This functional interface allows you to create and run a block of code
 * that is for example untested and might not actually work.
 */
public interface Whatever {
    /**
     * Single method that captures code you with to run "safely" without worrying about any consequences.
     */
    void run() throws Throwable;

    /**
     * Static method for running some code you do not care much about.
     *
     * @param whatever Lambda that captures your code.
     */
    static void whatever(Whatever whatever) {
        try {
            whatever.run();
        } catch (Throwable ex) {
            // whatever
        }
    }
}
