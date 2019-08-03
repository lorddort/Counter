package test.java;

import main.java.Counter.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandsTest {
	Commands command;
	Deck deck;

	@Before
	void setUp() throws Exception {
		
	}
	
	@Test
	void chooseCommandTest() throws Exception {
		String read = "new";
		InputStream in = new ByteArrayInputStream(read.getBytes());
		System.setIn(in);
		
		assertEquals(Commands.NEW, Commands.chooseCommand(deck));
	}
	
	@After
	void tearDown() throws Exception {
	}

}
