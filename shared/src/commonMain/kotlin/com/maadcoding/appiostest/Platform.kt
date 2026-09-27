package com.maadcoding.appiostest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform