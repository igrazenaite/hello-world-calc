package it.akademija;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:application-context.xml"})
public class AppConfig {
//    @Autowired
//    DataSourceProperties dataSourceProperties;
//
//    @Bean
//    @ConfigurationProperties(prefix = DataSourceProperties.PREFIX)
//    DataSource realDataSource() {
//        DataSource dataSource = DataSourceBuilder
//                .create(this.dataSourceProperties.getClassLoader())
//                .url(this.dataSourceProperties.getUrl())
//                .username(this.dataSourceProperties.getUsername())
//                .password(this.dataSourceProperties.getPassword())
//                .build();
//        return dataSource;
//    }
//
//    @Bean
//    @Primary
//    DataSource dataSource() {
//        return new DataSourceSpy(realDataSource());
//   }
	
	@Bean 
	public Product productOne() {
		return new Product("Habenaria radiata", 15.0);
	}
	
	@Bean 
	public Product productTwo() {
		return new Product("Habenaria radiata", 20.0);
	}
}