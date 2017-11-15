package com.team_l.ali.basicmvp.ui.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.team_l.ali.basicmvp.R
import com.team_l.ali.basicmvp.ui.base.BaseActivity

class MainActivity : BaseActivity(),MainMvpView {

    companion object {
        fun getStartIntent(context: Context) = Intent(context,MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showData(data: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
