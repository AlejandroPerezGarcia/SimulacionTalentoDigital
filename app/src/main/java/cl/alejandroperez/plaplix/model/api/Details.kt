package cl.alejandroperez.plaplix.model.api

data class Details(
    val credit: Boolean,
    val description: String,
    val id: Int,
    val image: String,
    val lastPrice: Int,
    val name: String,
    val price: Int
)