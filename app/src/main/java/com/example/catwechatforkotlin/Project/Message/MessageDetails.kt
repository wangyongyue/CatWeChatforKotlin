package com.example.catwechatforkotlin.Project.Message

import com.example.catwechatforkotlin.Project.Activitys.DefaultActivity
import com.example.catwechatforkotlin.Project.Activitys.DefaultPortocol
import com.example.catwechatforkotlin.Project.Component.UserData
import com.example.wangyongyue.myapplication.Components.Cat
import com.example.wangyongyue.myapplication.Observe.Observe

class MessageDetails: DefaultPortocol {

    override val listOb = Observe()

    companion object{

        fun getActivity(): Class<Any>{

            return DefaultActivity::class.java as Class<Any>
        }



    }

    override fun startListen() {


        listOb.v_list(true,{

            var items = mutableListOf<Cat>()
            for (i in 1..12){
                items.add(UserData("消息详情$i"))
            }

            return@v_list items
        })

    }

}