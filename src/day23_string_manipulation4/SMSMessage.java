package day23_string_manipulation4;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender : [ Nadir ] From Number <(222)333-4455> Message :{Hello,lets code some java}";

        String sender = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        String phoneNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        String messageBody =  message.substring(message.indexOf("{")+1, message.indexOf("}"));

        sender = sender.trim(); // trims the spaces from front and end

        System.out.println("sender = " + sender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("messageBody = " + messageBody);

        // trim() method
        String word = "     s q q    ";
        System.out.println(word.trim());// will trim space from front and end not from middle


    }
}
