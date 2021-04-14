package com.example.demo

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe

class FuelDownloaderTest : FunSpec({
    val fuelDownloader = FuelDownloader()

    context("Positive test") {
        test("download") { fuelDownloader.download() shouldNotBe "" }
    }
})