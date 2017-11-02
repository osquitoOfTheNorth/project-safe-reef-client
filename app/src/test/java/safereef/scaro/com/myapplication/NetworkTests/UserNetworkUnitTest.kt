package safereef.scaro.com.myapplication.NetworkTests

import org.junit.Test

import safereef.scaro.com.myapplication.Entities.User
import safereef.scaro.com.myapplication.Network.BaseNetworkConnector

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UserNetworkUnitTest {
    var network : BaseNetworkConnector = BaseNetworkConnector()
    var user : User = User("a", "c", "d", "e", "f")
    @Test
    fun testNewUser() {
        network.retrieveUserService().addUser(user).execute()
    }
}
