package safereef.scaro.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import safereef.scaro.com.myapplication.Network.BaseNetworkConnector
import javax.inject.Inject

class RegistrationActivity : AppCompatActivity() {


    @Inject lateinit var networkConnector : BaseNetworkConnector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }
}
