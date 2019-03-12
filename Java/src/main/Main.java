package main;

import main.URI_1001.URI_1001;
import main.URI_1024.URI_1024;
import main.URI_2717.URI_2717;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        URI_1001 uri_1001 = new URI_1001();
        uri_1001.execute();

        URI_1024 uri_1024 = new URI_1024();
        uri_1024.execute();

        URI_2717 uri_2717 = new URI_2717();
        uri_2717.execute();
    }

}
