package cl.alejandroperez.plaplix.model.api

import retrofit2.http.GET

interface ApiProducts {

   /* @GET("products")
    fun getAllProducts(): ArrayList<Products>*/

    @GET("details")
    fun getAllDetails(): ArrayList<Details>

}