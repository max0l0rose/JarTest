package com.example;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AppCommand1
		//extends SecuredCommand
{

	//@CliCommand(value = {"comA", "ca"})
	@ShellMethod(key = {"commanda", "ca"}, value = "commandA descript...")
	public String commandA(
			//@CliOption(key = "p1") String p1
			@ShellOption(arity = 3, defaultValue = "deffffff")
					String text,
			@ShellOption(defaultValue = "Text2")
					String text2
	) {
		return text + text2;
	}

}
