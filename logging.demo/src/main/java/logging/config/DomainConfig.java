package logging.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("logging.entity")
@EnableTransactionManagement
// enver repositories are configured to track data modifications
@EnableEnversRepositories(basePackages = { "logging.persistence" })
@EnableJpaAuditing
@EnableAspectJAutoProxy
public class DomainConfig {
}
