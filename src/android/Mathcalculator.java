package cordova-plugin-Mathcalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Mathcalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }

        if (action.equals("add")) {
            this.add(args,callback);
            return true;
        }
        else (action.equals("sub")) {
            this.sub(args,callback);
            return true;
        }else (action.equals("mul")) {
            this.mul(args,callback);
            return true;
        } 
         else (action.equals("div")) {
            this.div(args,callback);
            return true;
        } 

        
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void add(JSONArray args,callbackContext callback){
        if (args != null){
            try {
                int val1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int val2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                callback.success(""+(val1+val2));

            }
            catch(Exception ex){

            }
        }
        else{
            callback.error("Please Do not pass the null parameters.")
        }
    }

    private void sub(JSONArray args,callbackContext callback){
        if (args != null){
            try {
                int val1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int val2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                callback.success(""+(val1-val2));

            }
            catch(Exception ex){

            }
        }
        else{
            callback.error("Please Do not pass the null parameters.")
        }
    }

      private void mul(JSONArray args,callbackContext callback){
        if (args != null){
            try {
                int val1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int val2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                callback.success(""+(val1*val2));

            }
            catch(Exception ex){

            }
        }
        else{
            callback.error("Please Do not pass the null parameters.")
        }
    }

      private void div(JSONArray args,callbackContext callback){
        if (args != null){
            try {
                int val1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int val2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                callback.success(""+(val1/val2));

            }
            catch(Exception ex){

            }
        }
        else{
            callback.error("Please Do not pass the null parameters.")
        }
    }
}
