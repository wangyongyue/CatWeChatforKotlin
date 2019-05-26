package com.example.catwechatforkotlin.Project.Book

import android.widget.Toast
import com.example.catwechatforkotlin.Project.Activitys.DefaultActivity
import com.example.catwechatforkotlin.Project.Activitys.DefaultPortocol
import com.example.catwechatforkotlin.Project.Component.UserData
import com.example.catwechatforkotlin.Project.Fragments.DefaultFragment
import com.example.catwechatforkotlin.Project.Fragments.DefaultFragmentPortocol
import com.example.wangyongyue.myapplication.Components.Cat
import com.example.wangyongyue.myapplication.Observe.Observe
import com.example.wangyongyue.myapplication.Router.Router

class Book: DefaultFragmentPortocol{

    override val listOb = Observe()
    override val indexOb = Observe()
    companion object{

        fun <T> getActivity(): Class<T>{

            return DefaultActivity::class.java as Class<T>
        }

    }

    fun getFragment(): DefaultFragment {

        val f = DefaultFragment()
        f.model = this

        return f
    }

    override fun startListen() {


        listOb.v_list(true,{

            var items = mutableListOf<Cat>()
            for (i in 1..12){
                items.add(UserData("联系人$i"))
            }

            return@v_list items
        })

        indexOb.v_index {


            Router.push(BookDetails.getActivity(),BookDetails.toString())
        }

    }

}
