package gwt;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetwithtimeController {

	private static final String template = "Hello, %s, the time is %s";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/welcome")
	public Greetwithtime greetwithtime(@RequestParam(value="name", defaultValue="World") Date date){
		return new Greetwithtime(counter.incrementAndGet(),
			String.format(template, date));
	}
}