package safereef.scaro.com.myapplication.Network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import safereef.scaro.com.myapplication.Entities.AuthenticationHeader

/**
 * Created by omenji on 11/2/17.
 */
interface AuthenticationTokenService {

    @POST("/oauth/token")
    @Headers("content-type: application/json")
    fun getRequestHeaderToken(@Body clientSecrets :  HashMap<String, String>) : Call<AuthenticationHeader>

}