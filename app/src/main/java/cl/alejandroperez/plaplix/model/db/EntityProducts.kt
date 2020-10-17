package cl.alejandroperez.plaplix.model.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "details_table")
class EntityDetails (

    @PrimaryKey val id: Int,
    val name: String,
    val price: Int,
    val image: String,
    val description: String,
    val lastPrice: Int,
    val credit: Boolean

)
