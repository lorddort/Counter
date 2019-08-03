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
	void test() throws Exception {
		String read = "new";
		//String read2 = "hunter";
		//String read3 = "bla";
		InputStream in = new ByteArrayInputStream(read.getBytes());
		//InputStream in2 = new ByteArrayInputStream(read2.getBytes());
		//InputStream in3 = new ByteArrayInputStream(read3.getBytes());
		System.setIn(in);
		//System.setIn(in2);
		//System.setIn(in3);
		assertEquals(Commands.NEW, Commands.chooseCommand(deck));
	}
	
	@After
	void tearDown() throws Exception {
	}

}
