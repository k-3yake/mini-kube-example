package org.k3yake.cityApi.monitor

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import kotlinx.coroutines.experimental.async

/**
 * Created by katsuki-miyake on 18/04/28.
 */
open class Monitor {

}

fun main(args: Array<String>) {
  while (true) {
    Thread.sleep(300)
    async {
      val (request, response, result) = "http://localhost:8080/ready".httpGet().responseString()
      when (result) {
        is Result.Failure -> {
          println("○")
        }
        is Result.Success -> {
          println("●")
        }
      }
    }
  }
}
