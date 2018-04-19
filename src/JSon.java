import java.util.HashMap;
import com.google.gson.Gson;

public class JSon {

	private Gson gson;

	public JSon() {

		this.gson = new Gson();

	}

	public String getJSon(HashMap account) {

		return gson.toJson(account);
	}
}
