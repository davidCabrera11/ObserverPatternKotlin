package model

import model.observer.Observer

class User(val id:String, val name:String, val email:String):Observer{

    override fun update() {
        println("New video Posted")

    }


}