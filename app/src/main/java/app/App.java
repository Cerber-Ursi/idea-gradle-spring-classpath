package app;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    System.out.println(ByteArrayOutputStream.class.getPackage());
  }
}
