package com.example.catwechatforkotlin

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.support.v4.app.Fragment
import android.widget.Toast
import com.example.catwechatforkotlin.Project.Book.Book
import com.example.catwechatforkotlin.Project.Found.Found
import com.example.catwechatforkotlin.Project.Fragments.DefaultFragment
import com.example.catwechatforkotlin.Project.Message.NewMessage
import com.example.catwechatforkotlin.Project.Mine.Mine
import com.example.wangyongyue.myapplication.CActivity.CActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : CActivity() ,DefaultFragment.OnFragmentInteractionListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomBar.setOnTabSelectListener {

            if (it == R.id.tab_favorites){


                val tx = supportFragmentManager.beginTransaction()
                tx.replace(R.id.fragment_default,NewMessage().getFragment(),it.toString())
                tx.commit()


            }else if (it == R.id.tab_nearby){

                val tx = supportFragmentManager.beginTransaction()
                tx.replace(R.id.fragment_default,Book().getFragment(),it.toString())
                tx.commit()



            }else if (it == R.id.tab_friends){

                val tx = supportFragmentManager.beginTransaction()
                tx.replace(R.id.fragment_default,Found().getFragment(),it.toString())
                tx.commit()

            }

        }





    }

    override fun onFragmentInteraction(uri: Uri) {
    }


}
