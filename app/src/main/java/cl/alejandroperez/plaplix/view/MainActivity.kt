package cl.alejandroperez.plaplix.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cl.alejandroperez.plaplix.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        Log.d("activiti" , "hola")
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment, ListFragment.newInstance("", ""), "vista")
                .commit()
        }else {
            supportFragmentManager.findFragmentByTag("vista")
        }


    }
}