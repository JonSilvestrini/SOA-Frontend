package fatec.soa.nasa.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientEngine<T> {

	@Value("${api.token}")
	private String apiToken;

    private final WebClient client = WebClient.create();

    public T callUrlSync(String url, ParameterizedTypeReference<T> typeReference) {
        return client.get()
                .uri(url)
                .header("Authorization", apiToken)
                .retrieve()
                .bodyToMono(typeReference)
                .block();
    }
}
