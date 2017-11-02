package safereef.scaro.com.myapplication.Network


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import safereef.scaro.com.myapplication.Entities.AuthenticationRequestBody
import safereef.scaro.com.myapplication.Network.Callbacks.AuthenticationTokenCallback
import safereef.scaro.com.myapplication.Network.Callbacks.AuthenticationTokenHeaderHolder
import javax.inject.Inject


/**
 * Created by omenji on 11/1/17.
 */


class BaseNetworkConnector : AuthenticationTokenHeaderHolder {
    private var authHeaderString = ""
    private var clientId = "OP1RTPcgDymKAdNcl959kF7vSFiTyeME"
    private var clientSecret = "GjYVsPPWIBo5Eur_KmnLo4ERJQtUg3KiPonPkLJefqD8vW88I8brcLyx4mgjp92O"
    private var clientAuthParams = HashMap<String,String>()
    private var baseUrl : String = "https://safe-reef-58338.herokuapp.com/"
    private var authBaseUrl : String = "https://safereef.auth0.com/"
    private var userService : UserService
    private var authTokenService : AuthenticationTokenService
    @Inject constructor() {
        clientAuthParams.put("client_id", clientId)
        clientAuthParams.put("client_secret", clientSecret)
        clientAuthParams.put("audience","https://safereef.auth0.com/api/v2/")
        clientAuthParams.put("grant_type","client_credentials")
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()

        val retrofitAuth = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(authBaseUrl)
                .build()
        //retrofit.
        authTokenService = retrofitAuth.create(AuthenticationTokenService::class.java)
        authTokenService.getRequestHeaderToken(clientAuthParams)
                        .enqueue(AuthenticationTokenCallback(this))
        userService = retrofit.create(UserService::class.java)

    }

    fun retrieveUserService() : UserService{
        return userService
    }

    override fun setAuthentcationTokenHeaderHolder(tokenHeader: String) {
        authHeaderString = tokenHeader
    }

    override fun onAuthenticationTokenHeaderError() {
        //TODO: Handle error
    }

    override fun getAuthenticationTokenHeaderHolder() : String{
        return authHeaderString
    }
}