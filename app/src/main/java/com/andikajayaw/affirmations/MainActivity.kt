package com.andikajayaw.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andikajayaw.affirmations.adapter.ItemAdapter
import com.andikajayaw.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializa data
        val myDataSet = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        /**
         * CHANGE VISUALIZE INTO GRID LAYOUT MANAGER
         * */
//        val itemAdapter = ItemAdapter(this, myDataSet)
//
//        recyclerView.apply {
//            layoutManager = GridLayoutManager(this@MainActivity, 3)
//            adapter = itemAdapter
//        }
        /**
         * END
         */

        /**
         * LINEAR LAYOUT MANAGER - VERTICAL
         */
        recyclerView.adapter = ItemAdapter(this, myDataSet)
        /**
         * END
         */

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}