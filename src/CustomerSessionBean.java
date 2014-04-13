import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.List;


/**
 * Created by tristian2 on 16/02/2014.
 */
@Stateless
@Named
public class CustomerSessionBean {

    private List<Name> CustomerNames;

    public List<Name> getCustomerNames() {
        Name customer1 = new Name("bob stanley");
        Name customer2 = new Name("lisa lee");
        Name customer3 = new Name("marc taley");
        Name customer4 = new Name("brad ipliy");

        CustomerNames.add(customer1);
        CustomerNames.add(customer2);
        CustomerNames.add(customer3);
        CustomerNames.add(customer4);

        return CustomerNames;
    }





}
