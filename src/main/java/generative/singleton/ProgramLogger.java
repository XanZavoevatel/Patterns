package generative.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n";

    /* модификатор synchronized необходим для избежания некорректной работы
    * в многопоточном режиме, таким образом мы заставим другой поток ожидать,
    * пока первый не закончит работать с данным методом
    * */
    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String info) {
        logFile += info + "\n";
    }
     public void showLogFile() {
         System.out.println(logFile);
     }
}
