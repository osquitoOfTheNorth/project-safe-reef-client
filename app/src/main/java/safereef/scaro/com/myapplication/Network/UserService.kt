package safereef.scaro.com.myapplication.Network

import retrofit2.Call
import retrofit2.http.*
import safereef.scaro.com.myapplication.Entities.GenericNetworkResponse
import safereef.scaro.com.myapplication.Entities.User

/**
 * Created by omenji on 11/1/17.
 */
interface UserService {

    @GET("/api/v1/user")
    fun listUsers(@Query("searchString") searchParam : String) : Call<List<User>>

    @POST("/api/v1/user")
    fun addUser(@Query("user") newUser : User) : Call<GenericNetworkResponse>

    @POST("/api/v1/user/{user_id}")
    fun updateUser(@Path("user_id") existingUser : User) : Call<User>

    @DELETE("/api/v1/user")
    fun removeUser(@Query("_id") userId : String) : Call<GenericNetworkResponse>


}