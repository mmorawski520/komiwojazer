package com.example.komiwojazer


import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MyListAdapter(listdata: Array<City>) :
    RecyclerView.Adapter<MyListAdapter.ViewHolder>() {
    private val listdata: Array<City>

    // RecyclerView recyclerView;
    init {
        this.listdata = listdata
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cityData: City = listdata[position]
        holder.textView.setText(listdata[position].getCity())
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var relativeLayout: RelativeLayout

        init {
            imageView = itemView.findViewById<View>(R.id.imageView) as ImageView
            textView = itemView.findViewById<View>(R.id.textView) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.relativeLayout) as RelativeLayout
        }
    }
}
