package beable.indian.poker.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import beable.indian.poker.message.Greeting;
import beable.indian.poker.message.TestMessage;

@Controller
public class JoinController {
	@MessageMapping("/connect")
	@SendTo("/connect")
	public Greeting join(TestMessage message) {
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
