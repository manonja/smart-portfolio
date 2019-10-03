# Only needed for testing
scala_library(
    name = "server",
    dependencies = [
        "3rdparty/jvm:akka-http",
        "3rdparty/jvm:akka-http-spray-json",
        "3rdparty/jvm:akka-http-xml",
        "3rdparty/jvm:akka-stream",
        "3rdparty/jvm:scala-logging",
        "3rdparty/jvm:logback-classic",
        "3rdparty/jvm:akka-http-testkit",
        "3rdparty/jvm:akka-stream-testkit",
        "3rdparty/jvm:akka-testkit",
        "3rdparty/jvm:scalatest",
    ],
    sources = rglobs(
        "src/main/scala/org/smartportfolio/*.scala",
    ),
)

jvm_binary(
    name = "smartportfolio-server",
    basename = "smartportfolio-server",
    dependencies = [
        ":server",
    ],
    main = "org.smartportfolio.QuickstartServer",
)
