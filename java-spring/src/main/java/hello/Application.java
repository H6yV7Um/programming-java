package hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by yancy on 2018/4/22.
 */

public class Application {


    MessageService mockMessageService() {
        System.out.println("Hello World 12345");
        return new MessageService() {
            public String getMessage() {
                System.out.println("Hello World 12345");
                return "Hello World 12345";
            }
        };
    }

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Resource pathResource = new ClassPathResource("spring.xml");
        BeanFactory context = new XmlBeanFactory(pathResource);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        Application application = (Application) context.getBean("application");
        application.mockMessageService();

        messagePrinter.printMessage();
    }

}
