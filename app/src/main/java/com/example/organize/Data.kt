package com.example.organize

import io.realm.RealmObject

open class Data : RealmObject() {
    var date = ""
    var tempreture = ""
    var precipition = ""
    var daylightHour = ""
}