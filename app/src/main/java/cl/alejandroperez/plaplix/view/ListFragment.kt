package cl.alejandroperez.plaplix.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.alejandroperez.plaplix.R
import cl.alejandroperez.plaplix.model.db.EntityDetails
import cl.alejandroperez.plaplix.viewmodel.DetailsViewModel


class ListFragment : Fragment() {
        private var details = ArrayList<EntityDetails>()
        private lateinit var adapter : AdapterDetails
    private lateinit var DetailsViewModel : DetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
                ListFragment()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = AdapterDetails(details)


    }
}