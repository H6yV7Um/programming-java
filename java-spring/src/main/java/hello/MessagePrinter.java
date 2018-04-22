package hello;

/**
 * Created by yancy on 2018/4/22.
 */

public class MessagePrinter {

    final private MessageService service;


    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
