package link.rekruter.interview.util;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Initialize {

	@ShellMethod("Initialize the interview")
	public String initialize(String name, String stage) {
		return name + " will be interviewd for the following stage " + stage;
	}
	
	

}
