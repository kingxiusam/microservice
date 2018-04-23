package cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: HuangDong
 * Date: 2017\10\27 0027
 * Time: 10:20
 * ClassName：EurekaApplication
 * To change this template use File | Settings | File Templates.
 * Description:使用Eureka做服务发现
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaApplication.class)
                .web(true)
                .run(args);
    }

}
