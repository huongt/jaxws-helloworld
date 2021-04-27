package jaxws.soapapi.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloWorldServiceImpl {

    @WebMethod
    public String hello(@WebParam(name = "name") String name) {
        return "Hello" + name + "!";
    }

    @WebMethod
    public TopNews getTopNews() {
        TopNews tn = new TopNews();
        tn.setHighlights("This is highlight");
        tn.setTitle("This is available");
        return tn;
    }
}
