package com.dprk.infokids51

data class ListItem(
    var nameCompany: String,
    //var emailCompany: String,
    var telCompany: String,
    var webCompany: String,
    var locateCompany: String,
    var infoCompany: String = "no info"
)

data class PartItem(
    var namePart : String
)


