package test.java;

import main.java.Counter.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandsTest {
	Commands command;

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void test() throws Exception {
		String read = "new";
		InputStream in = new ByteArrayInputStream(read.getBytes());
		System.setIn(in);
		
		assertEquals(Commands.NEW, Commands.chooseCommand());
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

}
