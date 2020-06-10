package example.micronaut;

import io.micronaut.context.MessageSource;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.Locale;

@Controller
public class HomeController {

	private final MessageSource messageSource;

	@Inject
	public HomeController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Get
	public String main() {
		return messageSource.getMessage("invalid", MessageSource.MessageContext.of(new Locale("es")),"Invalid");
	}

}
