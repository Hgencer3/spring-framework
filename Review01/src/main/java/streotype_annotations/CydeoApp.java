package streotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import streotype_annotations.config.ConfigApp;
import streotype_annotations.model.DataStructure;
import streotype_annotations.model.DevOps;
import streotype_annotations.model.Microservices;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure ds=container.getBean(DataStructure.class);
        ds.getTotalHours();
        Microservices ms=container.getBean(Microservices.class);
        ms.getTotalHours();
        DevOps devops=container.getBean(DevOps.class);
        devops.getTotalHours();

    }
}
