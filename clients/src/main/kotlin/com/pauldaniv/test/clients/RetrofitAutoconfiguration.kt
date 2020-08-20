package com.pauldaniv.test.clients

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@EnableConfigurationProperties(ClientProperties::class)
class RetrofitAutoconfiguration {
  @Bean
  fun retrofitContext(
      specs: Optional<List<RetrofitClientSpecification?>?>): RetrofitClientContext {
    val retrofitClientContext = RetrofitClientContext()
    specs.ifPresent(retrofitClientContext::setConfigurations)
    return retrofitClientContext
  }
}