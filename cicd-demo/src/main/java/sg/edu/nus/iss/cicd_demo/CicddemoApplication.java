package sg.edu.nus.iss.cicd_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class CicddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicddemoApplication.class, args);
    }

    @Bean
    public CommonsRequestLoggingFilter log() {
        CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
        logger.setIncludeClientInfo(true);
        logger.setIncludeQueryString(true);
        return logger;
    }
}
