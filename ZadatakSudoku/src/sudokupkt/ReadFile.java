package sudokupkt;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
	static String asString(String fileName)throws Exception {
		 String data = "";
		    data = new String(Files.readAllBytes(Paths.get(fileName)));
		    return data;
		    }
}
