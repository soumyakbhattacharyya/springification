package pom.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("pom.entity")
@EnableTransactionManagement
// enver repositories are configured to track data modifications
@EnableEnversRepositories(basePackages = {"pom.persistence"})
@EnableJpaAuditing
public class DomainConfig {
}
