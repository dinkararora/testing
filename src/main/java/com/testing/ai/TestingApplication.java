package com.testing.ai;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Slf4j
public class TestingApplication {

    private final Environment env;

    public TestingApplication(Environment env) {
        this.env = env;
    }


    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     * @throws UnknownHostException if the local host name could not be resolved into an address
     */
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(TestingApplication.class, args);
////        DefaultProfileUtil.addDefaultProfile(app);
//        Map<String, Object> defProperties = new HashMap<>();
//        /*
//         * The default profile to use when no other profiles are defined
//         * This cannot be set in the <code>application.yml</code> file.
//         * See https://github.com/spring-projects/spring-boot/issues/1219
//         */
//        defProperties.put("spring.profiles.default", "local");
//        app.setDefaultProperties(defProperties);
//        Environment env = app.run(args).getEnvironment();
//        String protocol = "http";
//        if (env.getProperty("server.ssl.key-store") != null) {
//            protocol = "https";
//        }
//        log.info("\n----------------------------------------------------------\n\t" +
//                        "Application '{}' is running! Access URLs:\n\t" +
//                        "Local:    \t{}://localhost:{}\n\t" +
//                        "Swagger:  \t{}://localhost:{}{}/swagger-ui.html\n\t" +
//                        "External: \t{}://{}:{}\n\t" +
//                        "Profile(s): \t{}\n----------------------------------------------------------",
//                env.getProperty("spring.application.name"),
//                protocol,
//                env.getProperty("server.port"),
//                protocol,
//                env.getProperty("server.port"),
//                env.getProperty("server.servlet.context-path"),
//                protocol,
//                InetAddress.getLocalHost().getHostAddress(),
//                env.getProperty("server.port"),
//                env.getActiveProfiles());
    }


    /**
     * Initializes user management app.F
     * <p>
     * Spring profiles can be configured with a program arguments --spring.profiles.active=your-active-profile
     * <p>
     */
//    @PostConstruct
//    public void initApplication() {
//        Collection<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
////        if (activeProfiles.contains("dev") && activeProfiles.contains("prod")) {
////            log.error("You have misconfigured your application! It should not run " +
////                    "with both the 'dev' and 'prod' profiles at the same time.");
////        }
//        /* Similarly add checks with other profile such as QA & PROD or STAGING & PROD*/
//    }
}
