// Generated by Dagger (https://dagger.dev).
package com.loveuba.tryoneapplication.di;

import com.loveuba.tryoneapplication.data.TryService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TryOneModule_ProvideApiServiceFactory implements Factory<TryService> {
  private final Provider<Retrofit> retrofitProvider;

  public TryOneModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public TryService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static TryOneModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new TryOneModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static TryService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(TryOneModule.INSTANCE.provideApiService(retrofit));
  }
}
