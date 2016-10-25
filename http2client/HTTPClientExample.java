import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import static java.lang.System.out;

public class HTTPClientExample {

	public static void main(String[] args) throws Exception {
	  HttpClient.getDefault()
	    .request(URI.create("https://www.comarch.com"))
	    .GET()
	    .responseAsync()
	    .thenAccept(httpResponse ->
	        out.println(httpResponse.body(HttpResponse.asString()))
	    );
	  Thread.sleep(2000);
}
