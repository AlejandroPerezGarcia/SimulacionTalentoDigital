package cl.alejandroperez.plaplix.model.mapper

import cl.alejandroperez.plaplix.model.api.Details
import cl.alejandroperez.plaplix.model.db.EntityDetails


fun converter(details: List<Details>?) : ArrayList<EntityDetails>{
    var listDetails = ArrayList<EntityDetails>()

    details?.map {
        listDetails.add(
                EntityDetails(
                        it.id,
                        it.name,
                        it.price,
                        it.image,
                        it.description,
                        it.lastPrice,
                        it.credit

                )
        )
    }
    return listDetails
}


