package generative.singleton;

public class Runner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo(" Первая запись");
        ProgramLogger.getProgramLogger().addLogInfo(" Вторая запись");
        ProgramLogger.getProgramLogger().addLogInfo(" Третья запись");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
