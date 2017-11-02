package safereef.scaro.com.myapplication.NetworkTests

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import safereef.scaro.com.myapplication.Network.BaseNetworkConnector

/**
 * Created by omenji on 11/2/17.
 */
class AuthenticationTokenHeaderTest {
        var network : BaseNetworkConnector? = null

        @Before
        fun initNetwork(){
            network = BaseNetworkConnector()
        }
        @Test
        fun testGetToken() {
            Thread.sleep(3000)
            Assert.assertNotEquals(network!!.getAuthenticationTokenHeaderHolder(), "")
            
        }
}