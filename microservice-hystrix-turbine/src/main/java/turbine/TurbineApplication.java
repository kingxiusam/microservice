package turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 类名：TurbineApplication
 * 功能：
 * 详细：
 * 作者: huangdong
 * 修改日期：2018\4\23 0023
 * 说明：
 */

@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
    }
}
