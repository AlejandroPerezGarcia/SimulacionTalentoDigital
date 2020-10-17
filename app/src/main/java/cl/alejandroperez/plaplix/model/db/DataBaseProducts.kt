package cl.alejandroperez.plaplix.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [EntityDetails::class],version = 1)
abstract class DataBaseProducts : RoomDatabase(){

    abstract fun getDaoProducts() : DaoProducts

    companion object {

        @Volatile
        private var INSTANCE: DataBaseProducts? = null

        fun getDatabase(context: Context): DataBaseProducts {
            val tempInstance =
                INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBaseProducts::class.java,
                    "amiibo_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}