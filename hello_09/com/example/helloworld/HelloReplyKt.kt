// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: helloworld.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.helloworld;

@kotlin.jvm.JvmName("-initializehelloReply")
public inline fun helloReply(block: com.example.helloworld.HelloReplyKt.Dsl.() -> kotlin.Unit): com.example.helloworld.Helloworld.HelloReply =
  com.example.helloworld.HelloReplyKt.Dsl._create(com.example.helloworld.Helloworld.HelloReply.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `com.example.helloworld.HelloReply`
 */
public object HelloReplyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.helloworld.Helloworld.HelloReply.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.helloworld.Helloworld.HelloReply.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.helloworld.Helloworld.HelloReply = _builder.build()

    /**
     * `string message = 1;`
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * `string message = 1;`
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.example.helloworld.Helloworld.HelloReply.copy(block: `com.example.helloworld`.HelloReplyKt.Dsl.() -> kotlin.Unit): com.example.helloworld.Helloworld.HelloReply =
  `com.example.helloworld`.HelloReplyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

