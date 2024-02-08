package com.google.japp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform