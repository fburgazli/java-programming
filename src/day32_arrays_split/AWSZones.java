package day32_arrays_split;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String[] zonesToDeoploy = zones.split(",");
        System.out.println("Number of zones for Etsy = "  + zonesToDeoploy.length);
        for (String eachZone: zonesToDeoploy) {
            System.out.println("Deploying ["+ app + "] to <" + eachZone + ">...");
            System.out.println("Deployment completed for <"+ eachZone +">");
        }
        System.out.println("All deployments are complete,traffic enabled!");
    }
}
