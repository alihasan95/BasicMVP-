package com.team_l.ali.basicmvp.ui.base

import android.annotation.TargetApi
import android.support.v7.app.AppCompatActivity
import android.content.pm.PackageManager
import android.view.View
import android.widget.ProgressBar


/**
 * Created by ali on 11/15/2017.
 */
abstract class BaseActivity : AppCompatActivity(),MvpView {

    private val progressBar: ProgressBar? = null


    @TargetApi(android.os.Build.VERSION_CODES.M)
    fun requestPermissionsSafely(permissions: Array<String>,requestCode: Int) {
        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M){
            requestPermissions(permissions,requestCode)
        }
    }

    @TargetApi(android.os.Build.VERSION_CODES.M)
    fun hasPermissions(permissions: String):Boolean {
        return android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.M ||
                checkSelfPermission(permissions) == PackageManager.PERMISSION_GRANTED
    }

    override fun showLoding() {
        hideLoding()
        progressBar?.visibility = View.VISIBLE
    }

    override fun hideLoding() {
        if(progressBar!!.isShown){
            progressBar.visibility = View.GONE
        }

    }


}