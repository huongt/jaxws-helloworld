package jaxws.soapapi.helloworld;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Getter
@Setter
public class TopNews implements Serializable {
    private String title;
    private String highlights;
    private Date newDate;
}
