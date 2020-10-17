package cl.alejandroperez.plaplix.model.db

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface DaoDetails {

    @Query("select * from details_table")
    fun getAllDetails(): LiveData<List<EntityDetails>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetails(details: List<EntityDetails>)

    @Update
    suspend fun updateDetails(details: EntityDetails)






}