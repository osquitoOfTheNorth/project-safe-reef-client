package safereef.scaro.com.myapplication.Network.Callbacks

/**
 * Created by omenji on 11/2/17.
 */
interface AuthenticationTokenHeaderHolder {

    fun setAuthentcationTokenHeaderHolder( tokenHeader : String)
    fun onAuthenticationTokenHeaderError()
    fun getAuthenticationTokenHeaderHolder() :  String
}