package cl.alejandroperez.plaplix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import cl.alejandroperez.plaplix.model.Repository
import cl.alejandroperez.plaplix.model.db.EntityDetails

class DetailsViewModel (application: Application): AndroidViewModel(application){


    private var repository: Repository = Repository(application)
    var listDetails : LiveData<List<EntityDetails>> = repository.ListProducts

    init {
        repository = Repository(application)
        repository.loadApiDetail()
    }



}