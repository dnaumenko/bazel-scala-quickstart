load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

# https://github.com/bazelbuild/rules_scala/blob/master/docs/scala_test.md
scala_test(
    name = "service-test",
    srcs = glob(["service/*.scala"]),
    deps = ["//src/main/scala/com/example/service:echo-service"]
)