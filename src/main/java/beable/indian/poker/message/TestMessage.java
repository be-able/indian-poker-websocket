package beable.indian.poker.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestMessage {
	private String name;
	
	public TestMessage(String id) {
		this.name = id;
	}
}
