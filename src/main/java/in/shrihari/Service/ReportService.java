package in.shrihari.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
 //Add @Enable Scheduling in main
//    @Scheduled(fixedRate = 1000)
//    public void generateReport(){
//
//        //void
//        System.out.println("report Generated");
//    }

//use cron expression for custom sechedule
//    @Scheduled(fixedDelay = 3000)
//    public void generateDelayedReport(){
//
//        //void
//        System.out.println("report Generated");
//    }

    //site for generate cron expreesion
//    URL:crontab.cronhub.io
    @Scheduled(cron="0 * * * * *")
    public void generateReport(){

        //void
        System.out.println("report Generated");
    }
}
