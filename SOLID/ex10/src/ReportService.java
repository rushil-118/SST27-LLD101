public class ReportService {

    Logger logger;
    public ReportService(Logger logger){
        this.logger = logger;
    }

    void generate(){
        logger.log("Generating daily report...");
        report();
    }
    void report(){
        System.out.println("Report contents...");
    }

}