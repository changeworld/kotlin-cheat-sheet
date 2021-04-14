package com.example.demo

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

class FuelDownloader {

    /**
     *
     * @return String
     */
    fun download(): String {
        var data = ""
        val httpAsync =
            "https://raw.githubusercontent.com/changeworld/kotlin-cheat-sheet/main/README.md"
                .httpGet()
                .responseString { _, _, result ->
                    when (result) {
                        is Result.Failure -> {
                            val ex = result.getException()
                            println(ex)
                        }
                        is Result.Success -> {
                            data = result.get()
                        }
                    }
                }
        httpAsync.join()
        return data
    }
}