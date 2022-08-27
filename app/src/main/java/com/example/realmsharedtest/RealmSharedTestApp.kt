package com.example.realmsharedtest

import android.app.Application
import io.realm.Realm

class RealmSharedTestApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}