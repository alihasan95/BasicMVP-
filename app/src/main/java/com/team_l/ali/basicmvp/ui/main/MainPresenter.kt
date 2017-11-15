package com.team_l.ali.basicmvp.ui.main

import com.team_l.ali.basicmvp.ui.base.BasePresenter

/**
 * Created by ali on 11/15/2017.
 */
class MainPresenter<V: MainMvpView> : BasePresenter<V>() , MainMvpPresenter<V> {

    override fun getData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}