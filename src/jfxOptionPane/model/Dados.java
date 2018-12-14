package jfxOptionPane.model;

public class Dados {

    //Global Variables
    private static String message;
    private static String inputMessage;
    private static boolean confirmValue;


    //Restart all variables to value null
    public static void restart() {
        message      = null;
        inputMessage = null;
        confirmValue = false;
    }


    //Getters and Setters
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        Dados.message = message;
    }

    public static String getInputMessage() {
        return inputMessage;
    }

    public static void setInputMessage(String inputMessage) {
        Dados.inputMessage = inputMessage;
    }

    public static boolean isConfirmValue() {
        return confirmValue;
    }

    public static void setConfirmValue(boolean confirmValue) {
        Dados.confirmValue = confirmValue;
    }

}
