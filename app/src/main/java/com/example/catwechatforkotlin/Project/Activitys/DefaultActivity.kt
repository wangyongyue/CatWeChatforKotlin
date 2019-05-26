package com.example.catwechatforkotlin.Project.Activitys

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.catwechatforkotlin.Project.Component.RUserViewHolder
import com.example.catwechatforkotlin.R
import com.example.wangyongyue.myapplication.CActivity.CActivity
import com.example.wangyongyue.myapplication.Observe.Observe
import com.example.wangyongyue.myapplication.Recycler.Radapter

import kotlinx.android.synthetic.main.activity_default.*

class DefaultActivity : CActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default)


        val listener = Class.forName(this.className).getConstructor().newInstance() as DefaultPortocol


        var holders = mapOf<Int,String>(
            R.layout.item_layout to "com.example.catwechatforkotlin.Project.Component.RUserViewHolder"

        )

        recycler.layoutManager = LinearLayoutManager(this)
        var ad =  Radapter(holders)
        ad.v_list(listener.listOb)
        recycler.adapter = ad

        listener.startListen()

    }
}

interface DefaultPortocol{

    val listOb:Observe
    fun startListen(){}
}

