load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary( # https://github.com/bazelbuild/rules_scala/blob/master/docs/scala_binary.md
    name = "hello-world",
    srcs = glob(["Main.scala"]),
    deps = ["//src/main/scala/com/example/service:echo-service"],
    main_class = "com.example.Main"
)