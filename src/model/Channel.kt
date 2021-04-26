package model

import model.observer.Observable
import model.observer.Observer
import java.util.ArrayList

class Channel(val id:String, val name:String, video: Video):Observable() {


    fun uploadVideo(video: Video){
        notifyObservers()
        println("New video added to channel")

    }




}