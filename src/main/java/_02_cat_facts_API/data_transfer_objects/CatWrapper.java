
package _02_cat_facts_API.data_transfer_objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatWrapper {

@SerializedName("data")
@Expose
private String data;

public String getData() {
return data;
}

public void setData(String data) {
this.data = data;
}

}
