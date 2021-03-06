package com.e16din.gosuslugi.screens.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e16din.gosuslugi.App
import com.e16din.gosuslugi.helpers.LocalCoroutineScope

class RequestDetailsActivity : AppCompatActivity(), LocalCoroutineScope {

    class UserAgent
    class SystemAgent
    class ServerAgent
    class ScreenAgent
    class AppAgent

    // Subjects:

    val userAgent = UserAgent()
    val systemAgent = SystemAgent()
    val serverAgent = ServerAgent()
    val screenAgent = ScreenAgent()
    val appAgent = AppAgent()

    // Fruits:

    val app get() = App.get
    val activity = this
    val screenState get() = app.screenStatesMap[RequestDetailsActivity::class] as Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        runActions()
    }

    private fun runActions() {
        //todo:
    }
}
