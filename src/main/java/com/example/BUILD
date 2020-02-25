java_binary( # https://docs.bazel.build/versions/master/be/java.html#java_binary
    name = "hello-world",
    srcs = glob(["Main.java"]),
    deps = ["//src/main/java/com/example/service:echo-service"],
    main_class = "com.example.Main"
)