package methodsAndChallenges;

import java.io.BufferedReader;
import java.io.IOException;


public class JavaPcShutdown {

    public static void shutdown() throws RuntimeException, IOException {
        String shutdownCommand;
        String operatingSystem = System.getProperty("os.name");

        if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
            shutdownCommand = "sudo shutdown -h now";
        }
        else if ("Windows".equals(operatingSystem)) {
            shutdownCommand = "shutdown.exe -s -t 0";
        }
        else {
            throw new RuntimeException("Unsupported operating system.");
        }

        Runtime.getRuntime().exec(shutdownCommand);
        System.exit(0);
    }

    public static void main(String[] args) throws IOException {


        String operatingSystem = System.getProperty("os.name");
        System.out.println(operatingSystem);

        System.out.println(Runtime.getRuntime().exec(" say Shutting Down "));
        System.out.println(Runtime.getRuntime().exec("sudo shutdown -h now"));



    }

}
