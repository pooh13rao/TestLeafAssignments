package assignments.week3.Polymorphism;

public class API {

	public static void main(String[] args) {
		APIClient api = new APIClient();

        // Call the sendRequest method with only the endpoint
        api.sendRequest("API Endpoint A");

        // Call the overloaded sendRequest method with endpoint, request body, and request status
        api.sendRequest("API Endpoint B", "{ \"key1\": \"value1\" }", false);
        
       System.out.println("--------"); 
        //Second set of values
        api.sendRequest("API Endpoint C ");
        api.sendRequest("API Endpoint D ", "{ \"key2\": \"value2\" }", true);
    }
	}


