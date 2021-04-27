package jaxws.soapapi.helloworld;

import javax.xml.ws.Endpoint;

public class ServerApp {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9980/helloworld", new HelloWorldServiceImpl());
        System.out.println("Hello world service started");
    }
}
