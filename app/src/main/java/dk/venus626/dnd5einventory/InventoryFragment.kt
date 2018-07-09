package dk.venus626.dnd5einventory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter

class InventoryFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_inventory, container)

        val viewManager = LinearLayoutManager(context)
        val viewAdapter = Adapter(resources.getStringArray(R.array.planets_array))

        val recyclerView = view.findViewById(R.id.list_inventory) as RecyclerView
        with (recyclerView) {
            layoutManager = viewManager
            adapter = viewAdapter
        }

        return view
    }
}