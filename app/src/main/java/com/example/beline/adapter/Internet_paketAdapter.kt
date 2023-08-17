package com.example.beline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.beline.R
import com.example.beline.model.iteamInetpaket
import com.example.beline.ui.InternetActivity
import com.example.beline.ui.MainActivity

class Internet_paketAdapter(val context: Context, val list:ArrayList<iteamInetpaket>):
RecyclerView.Adapter<Internet_paketAdapter.InternetViewHolder>(){
    lateinit var LlClick:LinearLayout

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InternetViewHolder {
        val view:View
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.iteam_inetpaket, parent, false)
           return InternetViewHolder(view)

    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: InternetViewHolder, position: Int) {
        val paket =list[position]
        holder.apply {
            tv150.text=paket.tv150GB
            tv_kunga.text=paket.tvKunda
            tv_Gb.text=paket.tvGB
            tv_money.text=paket.tvMoney

            ll_click_all.setOnClickListener {
                var intent = Intent(context, InternetActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
    class InternetViewHolder(view:View):RecyclerView.ViewHolder(view){

        val tv150=view.findViewById<TextView>(R.id.tv_150gb)
        val tv_kunga=view.findViewById<TextView>(R.id.tv_kunga)
        val tv_money=view.findViewById<TextView>(R.id.tv_money)
        val tv_Gb=view.findViewById<TextView>(R.id.tv_Gb)
        val rvVibir=view.findViewById<RecyclerView>(R.id.rv_vibor)
        val rvInternet=view.findViewById<RecyclerView>(R.id.rv_internet_paket)
        val ll_click_all=view.findViewById<LinearLayout>(R.id.ll_click_all)

    }

}
//class PaketAdapter( val list: ArrayList<Paket>) :
//    RecyclerView.Adapter<PaketAdapter.PaketViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaketViewHolder {
//        val view:View
//        view= LayoutInflater.from(parent.context).inflate(R.layout.item_paket,parent,false)
//        return  PaketViewHolder(view)
//
//    }
//
//    override fun getItemCount()=list.size
//
//
//
//    override fun onBindViewHolder(holder:PaketViewHolder, position: Int) {
//        val feed = list[position]
//        holder.apply {
//            llInet.setOnClickListener {
//
//            }
//        }
//    }
//
//
//    class PaketViewHolder(view: View):RecyclerView.ViewHolder(view){
//        val tvInet = view.findViewById<TextView>(R.id.tv_inet)
//        val llInet = view.findViewById<LinearLayout>(R.id.ll_dad)
//        val tvinetGB = view.findViewById<TextView>(R.id.tv_inet_GB)
//        val tv_stoimost = view.findViewById<TextView>(R.id.tv_stoimost)
//        val tv_GB = view.findViewById<TextView>(R.id.tv_GB)
//
//    }
//
//}