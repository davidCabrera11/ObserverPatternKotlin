package model

import model.observer.Observable
import model.observer.Observer
import java.util.ArrayList

class Channel(val id:String, val name:String, video: Video):Observable {

    private val subscribedObserver = ArrayList<Observer>()

    fun uploadVideo(video: Video){
        notifyObservers()
        println("New video added to channel")

    }

    override fun subscribe(observer: Observer) {
        subscribedObserver.add(observer)

    }

    override fun unsubscribe(observer: Observer) {
        if (subscribedObserver.contains(observer))
            subscribedObserver.remove(observer)    }

    override fun notifyObservers() {
        subscribedObserver.map {observer -> observer.update()}
    }


}