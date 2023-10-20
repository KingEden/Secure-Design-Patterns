
public class Product{

    String P_Name;
    String Information;
    String Details;
    String Prices;
    String Availability;

    void GetInformation()
    {
        System.out.println("Product :" + P_Name );
        System.out.println("Information :" + Information );
        System.out.println("Details :" + Details );
        System.out.println("Prices :" + Prices );
        System.out.println("Availability :" + Availability );
    }
    void GetInformation(String N, String Inf,String De,String Pr,String Al)
    {
        P_Name = N;
        Information=Inf;
        Details=De;
        Prices = Pr;
        Availability=Al;
    }

}


