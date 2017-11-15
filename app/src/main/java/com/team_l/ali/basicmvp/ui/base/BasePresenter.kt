package com.team_l.ali.basicmvp.ui.base

/**
 * Created by ali on 11/15/2017.
 */
open class BasePresenter<V: MvpView> : MvpPresenter<V> {

    var mMvpView: V? = null

    override fun attachView(mvpView: V) {
        mMvpView = mvpView
    }

    override fun detachView() {
        mMvpView = null
        isViewAttached()
    }

    fun isViewAttached(): Boolean = mMvpView != null

    fun getMvpView(): V? = mMvpView


}