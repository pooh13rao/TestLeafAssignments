package assignments.week3.Polymorphism;

public class APIClient {
	 // Method to send a request with only the endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Endpoint: " + endpoint);
    }

    // Another method to send a request with endpoint, request body, and request status
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + (requestStatus ? "Successful" : "Failed") );
    }

}
