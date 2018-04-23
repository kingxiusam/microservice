package dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created with IntelliJ IDEA.
 * User: huangdong
 * Date: 2018\4\6 0006
 * Time: 23:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
    }
}
