package model.observer

import java.util.ArrayList


abstract class Observable{

    private val subscribedObserver = ArrayList<Observer>()


    fun subscribe(observer: Observer) {
        subscribedObserver.add(observer)

    }

    fun unsubscribe(observer: Observer) {
        if (subscribedObserver.contains(observer))
            subscribedObserver.remove(observer)    }

    fun notifyObservers() {
        subscribedObserver.map {observer -> observer.update()}
    }


}