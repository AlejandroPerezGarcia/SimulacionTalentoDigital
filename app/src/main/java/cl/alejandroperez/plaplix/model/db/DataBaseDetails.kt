package cl.alejandroperez.plaplix.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [EntityDetails::class],version = 1)
abstract class DataBaseDetails : RoomDatabase(){

    abstract fun getDaoDetails() : DaoDetails

    companion object {

        @Volatile
        private var INSTANCE: DataBaseDetails? = null

        fun getDatabase(context: Context): DataBaseDetails {
            val tempInstance =
                INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBaseDetails::class.java,
                    "details_table"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}