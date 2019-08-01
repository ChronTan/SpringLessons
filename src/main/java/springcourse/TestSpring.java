package springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());

        context=new ClassPathXmlApplicationContext("aContext.xml");
        TBean tBean=context.getBean("TBean", TBean.class);
        System.out.println(tBean.getStr());

        context.close();
    }
}
