package repro

import platform.Foundation.*

fun a() = NSURLSessionTask().response()!! as NSHTTPURLResponse
