package cl.alejandroperez.plaplix.model.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "details_table")
class EntityDetails (

    val credit: Boolean,
    val description: String,
    @PrimaryKey val id: Int,
    val image: String,
    val lastPrice: Int,
    val name: String,
    val price: Int
)
