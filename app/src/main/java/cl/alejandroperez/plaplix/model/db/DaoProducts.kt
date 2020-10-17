package cl.alejandroperez.plaplix.model.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface DaoProducts {

    @Query("select * from products_table")
    fun getAllProducts(): LiveData<List<EntityProducts>>

    @Query("select * from details_table")
    fun getAllDetails(): LiveData<List<EntityProducts>>






}