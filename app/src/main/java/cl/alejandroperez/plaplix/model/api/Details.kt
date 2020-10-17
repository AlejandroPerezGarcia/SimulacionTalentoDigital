package cl.alejandroperez.plaplix.model.api

data class Details(
    val id: Int,
    val name: String,
    val price: Int,
    val image: String,
    val description: String,
    val lastPrice: Int,
    val credit: Boolean

)