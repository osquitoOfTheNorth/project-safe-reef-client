package safereef.scaro.com.myapplication.Entities

import com.google.gson.annotations.SerializedName

/**
 * Created by omenji on 11/2/17.
 */
class AuthenticationHeader {
    @SerializedName("access_token")
    var accessToken : String = ""
}