package ua.shpp.gpt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import ua.shpp.gpt.common.domain.Generated;

@SpringBootApplication
@Generated(reason = "Not testing logs")
public class GptUaApp {

  private static final Logger log = LoggerFactory.getLogger(GptUaApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(GptUaApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
