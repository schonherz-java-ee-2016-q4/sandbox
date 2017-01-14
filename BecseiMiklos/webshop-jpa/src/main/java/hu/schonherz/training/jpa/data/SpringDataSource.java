package hu.schonherz.training.jpa.data;

import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties") // ez itt felszívja a datasource.propertiest
public class SpringDataSource {

    @Value("${datasource.serverName}")
    private String serverName;

    @Value("${datasource.port}")
    private Integer port;

    @Value("${datasource.database}")
    private String database;

    @Value("${datasource.user}")
    private String user;

    @Value("${datasource.password}")
    private String password;

    @Bean
    public DataSource createDataSource() { // létrehozzuk a datasourcet és csinálunk belőle egy spring bean-t
        PGPoolingDataSource dataSource = new PGPoolingDataSource();
        dataSource.setServerName(serverName);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(database);

        dataSource.setUser(user);
        dataSource.setPassword(password);

        return dataSource;
    }
}
