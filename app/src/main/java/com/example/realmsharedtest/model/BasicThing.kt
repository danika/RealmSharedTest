package com.example.realmsharedtest.model

import io.realm.RealmModel
import io.realm.annotations.RealmClass

@RealmClass
open class BasicThing(
    var firstName: String = "",
    var lastName: String = ""
) : RealmModel
