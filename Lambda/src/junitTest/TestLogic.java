package junitTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import logic.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;  
  
public class TestLogic { 
	@Test
	public void testUsernameIsNull() {
	 
	    assertThrows(IllegalArgumentException.class, () -> {
	        User user = new User();
	        user.setName(null);
	    });
	}
}  