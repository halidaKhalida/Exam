package com.example.beline.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beline.R
import com.example.beline.adapter.Internet_paketAdapter
import com.example.beline.adapter.XizmatlarAdapter
import com.example.beline.model.Xizmatlar
import com.example.beline.model.iteamInetpaket

class MainActivity : AppCompatActivity() {
    lateinit var feeds:ArrayList<iteamInetpaket>
    lateinit var xizmat:ArrayList<Xizmatlar>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initView2()
    }

    private fun initView2() {
        laodList2()

        val rvUslugi2 = findViewById<RecyclerView>(R.id.rv_vibor)
        rvUslugi2.adapter=XizmatlarAdapter(xizmat)
        rvUslugi2.layoutManager=LinearLayoutManager(this)
        rvUslugi2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvUslugi2.adapter = XizmatlarAdapter( xizmat)

    }

    private fun laodList2() {
        xizmat=ArrayList()
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
        xizmat.add(Xizmatlar("Xizmatlar"))
    }

    private fun initView() {
        laodList()
        val rvUslugi = findViewById<RecyclerView>(R.id.rv_internet_paket)
        rvUslugi.adapter=Internet_paketAdapter(this, feeds)
        rvUslugi.layoutManager= LinearLayoutManager(this)
    }

    private fun laodList() {
        feeds= ArrayList()
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))
        feeds.add(iteamInetpaket("gjdjedjesrjr","iuheshvboisduhbnl","irghoweuhgowuh","56"))

    }
}