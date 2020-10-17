package cl.alejandroperez.plaplix.model

import android.content.Context
import android.util.Log
import cl.alejandroperez.plaplix.model.api.Details
import cl.alejandroperez.plaplix.model.api.RetrofitProducts
import cl.alejandroperez.plaplix.model.db.DataBaseDetails
import cl.alejandroperez.plaplix.model.db.EntityDetails
import cl.alejandroperez.plaplix.model.mapper.converter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Repository(context: Context) {

    var dataBaseDetails = DataBaseDetails.getDatabase(context)
    var ListProducts = dataBaseDetails.getDaoDetails().getAllDetails()

    fun loadApiDetail(){

    val service = RetrofitProducts.retrofitIntance()
    val call = service.getAllDetails()

    call.enqueue(object : Callback<Details> {

        override fun onResponse(call: Call<Details>, response: Response<Details>) {
            Log.d("api", "${response.body()?.id}")

        //  Log.d("repository convertet", "Converter")
        // saveDatabase(converter(response.body()?.name))
        }

        override fun onFailure(call: Call<Details>, t: Throwable) {
            Log.d("Adapter", "Error al cargar ")
        }
    })
}
    fun saveDatabase(listDetailsEntity: List<EntityDetails>) {
        Log.d("api+++", "entramos")
        CoroutineScope(Dispatchers.IO).launch {
            dataBaseDetails.getDaoDetails()
                .insertDetails(listDetailsEntity as MutableList<EntityDetails>)
        }
    }





fun updateObjet(entityDetails: EntityDetails){

    CoroutineScope(Dispatchers.IO).launch {
        dataBaseDetails.getDaoDetails().updateDetails(entityDetails)
    }
}
}



