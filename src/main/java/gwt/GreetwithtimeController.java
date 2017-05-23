package gwt;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetwithtimeController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/welcome")
	public Greetwithtime greetwithtime(@RequestParam(value="name", defaultValue="World") String name){
		return new Greetwithtime(counter.incrementAndGet(),
			String.format(template, name));
	}
}