package top.omgdo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("top.omgdo.mapper")
public class MybatisPlusConfiguration {

}
