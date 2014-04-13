import javax.ejb.Stateless;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 * Created by tristian2 on 16/02/2014.
 */
@Named
@RequestScoped
public class Name {
    private String value;

    public String getValue() {
        return "ff" + this.value;
    }

    public Name () {
        value =  "fred";
    }
    public Name (String name) {
       value =  name;
    }





}
