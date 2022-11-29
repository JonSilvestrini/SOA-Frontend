package fatec.soa.nasa.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientEngine<T> {

	@Value("${api.key}")
	private String token;

    private final WebClient client = WebClient.create();

    public T callUrlSync(String url, ParameterizedTypeReference<T> typeReference) {
        return client.get()
                .uri(url)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(typeReference)
                .block();
    }


}
