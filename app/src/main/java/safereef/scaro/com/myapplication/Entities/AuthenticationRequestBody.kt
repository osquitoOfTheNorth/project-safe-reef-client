package safereef.scaro.com.myapplication.Entities

import com.google.gson.annotations.SerializedName

/**
 * Created by omenji on 11/2/17.
 */
data class AuthenticationRequestBody(
        @SerializedName("client_id")
        var clientId : String,

        @SerializedName("client_secret")
        var clientSecret :  String
)
