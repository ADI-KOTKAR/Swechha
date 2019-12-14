package com.example.template.Rv_Ward

data class Model(var title:String)

object Supplier{

    val wards = listOf<Model>(
        Model("Ward_1"),
        Model("Ward_2"),
        Model("Ward_3"),
        Model("Ward_4"),
        Model("Ward_5"),
        Model("Ward_6"),
        Model("Ward_7"),
        Model("Ward_8"),
        Model("Ward_9"),
        Model("Ward_10"),
        Model("Ward_11"),
        Model("Ward_12"),
        Model("Ward_13"),
        Model("Ward_14")
    )

//    for(i in 1..51)
//    {
//        wards += Model("Ward_$i")
//    }



}