package net.shopin.client.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import net.shopin.history.interceptors.HistoryTableInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-11-07 14:53
 **/
@Configuration
@MapperScan(value = "net.shopin.client.mapper",sqlSessionFactoryRef = "SqlSessionFactory")
public class DataSourceConfig {
    @Autowired
    private MyBatisPlusConfig myBatisPlusConfig;
    @Autowired
    private HistoryTableInterceptor historyTableInterceptor;


    @Bean("DataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public static DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("SqlSessionFactory")
    public SqlSessionFactory couponcoreSqlSessionFactory(@Qualifier("DataSource") DataSource dataSource ) throws Exception {
        MybatisSqlSessionFactoryBean mybatisFactoryBean =new MybatisSqlSessionFactoryBean();
        mybatisFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*.xml"));
        mybatisFactoryBean.setDataSource(dataSource);

        //关键代码 设置 MyBatis-Plus 分页插件\设置 myBatis 拦截器
        //, mybatisInterceptor,mybatisInterceptor,queryInterceptor
        //添加 historyTable 拦截器
        Interceptor[] plugins = {myBatisPlusConfig.paginationInterceptor(),historyTableInterceptor};

        mybatisFactoryBean.setPlugins(plugins);

        return mybatisFactoryBean.getObject();
    }

    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("SqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("net.shopin.client.mapper");
        return mapperScannerConfigurer;
    }
}
