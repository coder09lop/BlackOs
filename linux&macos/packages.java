import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class packages {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.println("wich os you have?");
    String os = scanner.nextLine();
    switch(os) {
        case "windows" -> {
            System.out.println("windows will not work!");
            System.exit(0);
        }
        case "linux" -> {
            System.out.println("linux will work");
            SimulateLoading();
            System.out.println("installing packages");
            System.out.println("packages installed");
            System.out.println("linux is ready");
            }
        case "macos" -> {
            System.out.println("macos will work");
            SimulateLoading();
            System.out.println("installing packages");
            System.out.println("packages installed");
            System.out.println("macos is ready");
        }


    }
    }
    private static void SimulateLoading() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        @SuppressWarnings("unused")
        Runnable loadingTask = () -> System.out.println("Loading...");
        executor.scheduleAtFixedRate(loadingTask, 0, 1, TimeUnit.SECONDS);
        try {
            
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    }
                executor.shutdown();
            
}
}
