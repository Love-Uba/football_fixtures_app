// Generated by Dagger (https://dagger.dev).
package com.loveuba.tryoneapplication.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TryOneModule_ProvideClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggerProvider;

  public TryOneModule_ProvideClientFactory(Provider<HttpLoggingInterceptor> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideClient(loggerProvider.get());
  }

  public static TryOneModule_ProvideClientFactory create(
      Provider<HttpLoggingInterceptor> loggerProvider) {
    return new TryOneModule_ProvideClientFactory(loggerProvider);
  }

  public static OkHttpClient provideClient(HttpLoggingInterceptor logger) {
    return Preconditions.checkNotNullFromProvides(TryOneModule.INSTANCE.provideClient(logger));
  }
}
