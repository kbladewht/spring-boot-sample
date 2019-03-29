package com.james.sample.file;

import com.james.sample.file.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SpringBootFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFileApplication.class, args);
    }

}
