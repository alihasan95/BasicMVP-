package com.team_l.ali.basicmvp.ui.main

import com.team_l.ali.basicmvp.ui.base.MvpView

/**
 * Created by ali on 11/15/2017.
 */
interface MainMvpView : MvpView {

    fun showData(data: String)

    fun showError(error: String)

}