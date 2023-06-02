import com.javatar.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloworld");
        obj.setMessage("Obj A");
        System.out.println(obj.getMessage());

        HelloWorld obj2 = (HelloWorld) context.getBean("helloworld");
        System.out.println(obj2.getMessage());

    }

}
