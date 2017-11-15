package com.team_l.ali.basicmvp.ui.base

/**
 * Created by ali on 11/15/2017.
 */
interface MvpPresenter<V: MvpView> {

    fun attachView(mvpView: V)

    fun detachView()

}