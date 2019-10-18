package cn.com.syzg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.com")
@MapperScan("cn.com.syzg.repository")
public class SyzgApplication {

    public static void main(String[] args) {
        SpringApplication.run(SyzgApplication.class, args);
    }

}
