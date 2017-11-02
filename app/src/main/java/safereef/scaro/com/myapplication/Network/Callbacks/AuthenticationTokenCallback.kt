package safereef.scaro.com.myapplication.Network.Callbacks
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import safereef.scaro.com.myapplication.Entities.AuthenticationHeader

/**
 * Created by omenji on 11/2/17.
 */
class AuthenticationTokenCallback(headerHolder: AuthenticationTokenHeaderHolder) : Callback<AuthenticationHeader> {

    private var headerHolder : AuthenticationTokenHeaderHolder = headerHolder

    override fun onFailure(call: Call<AuthenticationHeader>?, t: Throwable?) {
        headerHolder.onAuthenticationTokenHeaderError()
    }

    override fun onResponse(call: Call<AuthenticationHeader>?, response: Response<AuthenticationHeader>?) {
        if(response?.body()?.accessToken != null) {
            headerHolder.setAuthentcationTokenHeaderHolder(response.body()?.accessToken!!)
        } else {
            headerHolder.onAuthenticationTokenHeaderError()
        }
    }
}