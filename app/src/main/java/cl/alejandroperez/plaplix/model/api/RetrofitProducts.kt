package cl.alejandroperez.plaplix.model.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URl = "https://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"

class RetrofitProducts{
    companion object {
        fun retrofitIntance(): ApiProducts {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(ApiProducts::class.java)
        }
    }

}