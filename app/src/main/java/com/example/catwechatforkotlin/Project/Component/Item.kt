package com.example.catwechatforkotlin.Project.Component

import android.view.View
import android.widget.TextView
import com.example.wangyongyue.myapplication.Components.Cat
import com.example.wangyongyue.myapplication.Recycler.RHolder
import com.example.catwechatforkotlin.R

class UserData(var name:String): Cat() {

    override val layoutIdentity: Int
        get() = R.layout.item_layout


    //点击事件表示
    var eventdentifier:Int = 0

}
class RUserViewHolder(viewItem: View) : RHolder(viewItem){

    val textView: TextView = viewItem.findViewById(R.id.text)


    override fun setData(item: Cat){

        if (item is UserData){

            var model = item as? UserData
            textView.setText(model?.name)

            model?.eventdentifier = 0

        }

    }

}