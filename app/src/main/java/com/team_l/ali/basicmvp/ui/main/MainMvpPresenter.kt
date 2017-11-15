package com.team_l.ali.basicmvp.ui.main
import com.team_l.ali.basicmvp.ui.base.MvpPresenter

/**
 * Created by ali on 11/15/2017.
 */
interface MainMvpPresenter<V: MainMvpView> : MvpPresenter<V> {

    fun getData()

}
