package cl.alejandroperez.plaplix.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.alejandroperez.plaplix.R
import cl.alejandroperez.plaplix.model.db.EntityDetails

class AdapterDetails (private var detail: MutableList<EntityDetails> ) :
        RecyclerView.Adapter<AdapterDetails.PostHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterDetails.PostHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_list,parent,false)
        return PostHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterDetails.PostHolder, position: Int) {
       // return detail.size
    }



    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    class PostHolder (itemView: View) : RecyclerView.ViewHolder(itemView){


    }

}