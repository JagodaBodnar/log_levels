public class LogLevels {
    public static void main(String[] args) {
        String message = LogLevels.message("[ERROR]: Invalid operation");
        System.out.println(message);
        message = LogLevels.logLevel("[ERROR]: Invalid operation");
        System.out.println(message);
        message = LogLevels.reformat("[INFO]: Operation completed");
        System.out.println(message);
    }

    public static String message(String logLine) {
        String[] indexArr = logLine.split(":");
        return indexArr[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] indexArr = logLine.split(":");
        return indexArr[0].replaceAll("[\\[\\]]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String transformedLog = logLine.replace("[", "(").replace("]", ")");
        String[] indexArr = transformedLog.split(":");
        return indexArr[1].trim() + " " + indexArr[0].toLowerCase();
    }
}

