package java9;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessAPI {

    public static void main(String[] args) {
       
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        System.out.println("P ID "+PID);
        ProcessHandle.Info procInfo = self.info();
         
        Optional<String[]> args1 = procInfo.arguments();
        System.out.println(args1.get());
        Optional<String> cmd =  procInfo.commandLine();
        System.out.println(cmd.get());
        Optional<Instant> startTime = procInfo.startInstant();
        System.out.println(startTime.get());
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();  
        System.out.println(cpuUsage.get());

    }
}
