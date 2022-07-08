package liquibase.config;

import static org.zalando.logbook.Conditions.contentType;
import static org.zalando.logbook.Conditions.exclude;
import static org.zalando.logbook.Conditions.header;
import static org.zalando.logbook.Conditions.requestTo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;

@Configuration
public class LogbookConfig {

	@Bean
	public Logbook logbook() {
		Logbook logbook = Logbook.builder()
				.condition(exclude(requestTo("/health"), requestTo("/admin/**"),
						contentType("application/octet-stream"), header("X-Secret", newHashSet("1", "true")::contains)))
				.build();
		return logbook;
	}

	public static final <T> Set<T> newHashSet(T... objs) {
		Set<T> set = new HashSet<T>();
		Collections.addAll(set, objs);
		return set;
	}
}